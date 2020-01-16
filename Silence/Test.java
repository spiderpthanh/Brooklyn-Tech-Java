import java.util.ArrayList;

public class Test {
  public static void main(String[] args)
  {
    int[] samples1 = {0, 0, 0, 0, 4, 3, 6, 8, 2, -2, -3, 5, 6, 5, -7, 8, 9, -6, 9, 0, 0};
    Sound sound1 = new Sound(samples);
    System.out.println(sound1);
    System.out.println();
  
    int changes = sound1.limitAmplitude(5);
    System.out.println(sound1);
    System.out.println(changes + " values changed.");
    System.out.println();
    ArrayList<Integer> indexList = sound1.getPositionOfSmallestValue2();
    System.out.println(IndexList);
  }
  
}
