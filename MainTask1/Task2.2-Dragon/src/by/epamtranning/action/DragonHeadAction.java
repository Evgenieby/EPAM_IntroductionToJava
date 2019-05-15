package by.epamtranning.action;

public class DragonHeadAction {

    private int beginFirstPeriod = 0;
    private int beginSecondPeriod = 200;
    private int beginThirdPeriod = 300;
    private int headAtBirth = 3;
    private int headAtFirstPeriod = 3;
    private int headAtSecondPeriod = 2;
    private int head1AtThird = 1;

    public int calcHead(int age) {
        int totalAmountHead;

        if ((age > beginFirstPeriod) && (age < beginSecondPeriod)) {
            totalAmountHead = headAtBirth + (age * headAtFirstPeriod);
            return totalAmountHead;
        } else if ((age >= beginSecondPeriod) && (age < beginThirdPeriod)) {
            totalAmountHead = headAtBirth + (beginSecondPeriod - 1) *
                    headAtFirstPeriod + (age - beginSecondPeriod + 1) * headAtSecondPeriod;
            return totalAmountHead;
        } else {
            totalAmountHead = headAtBirth + (beginSecondPeriod - 1) *
                    headAtFirstPeriod + (beginThirdPeriod - beginSecondPeriod - 1) *
                    headAtSecondPeriod + (age - beginThirdPeriod + 1) * head1AtThird;
            return totalAmountHead;
        }
    }
}
