public class myArray {
   private int[] items;
   private int count;
   public  myArray(int length){
      items = new int[length];
   }
   public void insert(int item) {
      if (items.length == count) {
         items = new int[count+1];
         items[count++] = item;
      }else{
      items[count++] = item;
      }
   }
   public void print() {
      for (int i = 0; i < count; i++) {
         System.out.println(items[i]);
      }
   }
}