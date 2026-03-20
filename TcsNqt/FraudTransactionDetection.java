package TcsNqt;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.text.DecimalFormat;

class Transaction {
    String sender, receiver;
    double time, amount;

    Transaction(String s, String r, double t, double a) {
        this.sender = s;
        this.receiver = r;
        this.time = t;
        this.amount = a;
    }
}

public class FraudTransactionDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Transaction> list = new ArrayList<>();

        // Reading input lines: Sender,Receiver,Time,Amount
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            String[] p = line.split(",");
            list.add(new Transaction(p[0], p[1], Double.parseDouble(p[2]), Double.parseDouble(p[3])));
        }

        Set<Integer> fraudIndices = getIntegers(list);

        // Format and print fraud transactions
        DecimalFormat df = new DecimalFormat("0.##"); // Removes unnecessary trailing zeros
        for (int index : fraudIndices) {
            Transaction f = list.get(index);
            System.out.println(f.sender + "," + f.receiver + "," + df.format(f.time));
        }
        sc.close();
    }

    @NotNull
    private static Set<Integer> getIntegers(List<Transaction> list) {
        Set<Integer> fraudIndices = new TreeSet<>();

        // Compare each pair for fraud criteria
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Transaction t1 = list.get(i);
                Transaction t2 = list.get(j);

                if (t1.sender.equals(t2.sender) &&
                        t1.receiver.equals(t2.receiver) &&
                        t1.amount == t2.amount) {

                    // Check if time difference is within 1 minute (0.01)
                    if (Math.abs(t1.time - t2.time) <= 0.0101) { // 0.0101 to handle double precision
                        fraudIndices.add(i);
                        fraudIndices.add(j);
                    }
                }
            }
        }
        return fraudIndices;
    }
}
