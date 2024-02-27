package constants;

import collectiondemos.Product;

public class ConstantEx1 {
    public static void main(String[] args) {
        DayBreak lunch=DayBreak.LunchBreak;
        DayBreak lunch2=DayBreak.LunchBreak;
        boolean same=lunch2.equals(lunch);
        DayBreak morningTea=DayBreak.MorningTeaBreak;
        String break1Name=lunch.name();
        System.out.println("lunch="+break1Name+" "+lunch.ordinal());
        System.out.println("lunch time="+lunch.getStartTime()+" "+lunch.getEndTime());
        System.out.println("morning tea="+morningTea.name()+" "+morningTea.ordinal());
        System.out.println("morning tee time "+morningTea.getStartTime()+" "+morningTea.getEndTime());

        System.out.println("****iterating on all breaks");
        DayBreak breaks[]=DayBreak.values();
        for (DayBreak dayBreak:breaks){
            System.out.  println("break="+dayBreak+" "+dayBreak.getStartTime()+" "+dayBreak.getEndTime());
        }




    }
}
