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
   public void removeAt(int index){
      // WE GONNA VALIDATE THE INDEX 
      if (index < 0 || index >= count) {
         System.out.println("The Selected Index is not valide");
      }
      // WE GONNA SHIFT ALL THE ITEMS OF THE ARRAY ONE STEP TO LEFT  
      for (int i = index; i < count; i++) {
         items[index] = items[index+1];
      }
      // WE GONNA DECREMENT THE ARRAY ITEM LENGTH (BECAUSE WE REMOVED ONE ITEM)
      count--;
   }
   public void print() {
      for (int i = 0; i < count; i++) {
         System.out.println(items[i]);
      }
   }
}