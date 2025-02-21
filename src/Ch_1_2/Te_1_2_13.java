package Ch_1_2;

public class Te_1_2_13 {

    public static class _Transaction implements Comparable<_Transaction> {

        private String who;
        private Ex_1_2_12._SmartDate when;
        private double amount;

        public _Transaction(String tw, Te_1_2_11._SmartDate smartDate, int amount){

        }

        public _Transaction(String who, Ex_1_2_12._SmartDate when, double amount) {
            this.who = who;
            this.when = when;
            this.amount = amount;
        }

        public _Transaction(String transaction){
            String[] param = transaction.split(" ");
            if(param.length != 3){
                throw new IllegalArgumentException("Invalid transaction format");
            }
            who = param[0];
            String[] split = param[1].split("/");
            int y = Integer.parseInt(split[0]);
            int m = Integer.parseInt(split[1]);
            int d = Integer.parseInt(split[2]);
            when = new Ex_1_2_12._SmartDate(y, m, d);
            amount = Double.parseDouble(param[2]);

        }

        public String who(){
            return who;
        }

        public Ex_1_2_12._SmartDate when(){
            return when;
        }

        public double amount(){
            return amount;
        }

        @Override
        public int compareTo(_Transaction o) {
            return 0;
        }

        public boolean equals(Object x){
            if(this == x){
                return true;
            }
            if(x == null){
                return false;
            }
            if(this.getClass() != x.getClass()){
                return false;
            }
            _Transaction that = (_Transaction)x;
            if(!this.who.equals(that.who)){
                return false;
            }
            if(!this.when.equals(that.when)){
                return false;
            }
            if(this.amount != that.amount){
                return false;
            }
            return true;
        }

        public String toString(){
            return "_Transaction{" +
                    "who='" + who + '\'' +
                    ", when" + when +
                    ", amount" + amount +
                    '}';
        }
    }

    public static void main(String[] args) {
        _Transaction transaction = new _Transaction("wenhao 2024/02/17 100");
        System.out.println(transaction);
        _Transaction tw = new _Transaction("tw", new Ex_1_2_12._SmartDate(2020, 10, 10), 99999);
        System.out.println(tw);
        System.out.println(tw.when);
        System.out.println(tw.who);
        System.out.println(tw.amount);
    }
}
