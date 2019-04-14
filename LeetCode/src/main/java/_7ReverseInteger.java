public class _7ReverseInteger {

    public static void main(String args[]) {

        _7ReverseInteger rev = new _7ReverseInteger();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(rev.reverse(1463847412));
        System.out.println(rev.reverse(-423));
    }

    public int reverse(int num) {

        long newnum =0;
        boolean isNegative = false;

        if(num <0) {
            isNegative = true;
            num = num *-1;
        }

        while(num > 0) {
            newnum = newnum*10 + num%10;
            num = num/10;
        }

        if(newnum > Integer.MAX_VALUE) {
            return 0;
        }

        return isNegative?((int)newnum*-1):(int)newnum;
    }
}
