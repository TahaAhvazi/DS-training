public class myArray {
   private int[] items;
   private int count;
   public  myArray(int length){
      items = new int[length];
   }
   public void insert(int item) {
      // RESIZE THE ARRAY IF IT WAS FULL
      if (items.length == count) {
         // HERE WE GONNA CREATE A NEW ARRAY
         int[] newItems = new int[count*2];
         // HERE WE GONNA COPY ALL THE ITEM OF PREVIOUS ARRAY INTO NEW ONE
         for (int i = 0; i < count; i++) {
            newItems[i] = items[i];
         }
         items = newItems; // SET
      }
      // IF THE ARRAY WAS NOT FULL
      items[count++] = item;
   }
   public void removeAt(int index){
      // WE GONNA VALIDATE THE INDEX 
      if (index < 0 || index >= count) {
         System.out.println("The Selected Index is not valide");
      }
      // WE GONNA SHIFT ALL THE ITEMS OF THE ARRAY ONE STEP TO LEFT  
      for (int i = index; i < count; i++) {
         items[i] = items[i+1];
      }
      // WE GONNA DECREMENT THE ARRAY ITEM LENGTH (BECAUSE WE REMOVED ONE ITEM)
      count--;
   }
   public int indexOf(int item){
      for (int i = 0; i < count; i++) {
         if (item == items[i]) {
            return i;
         }
      }
      return -1;
   }
   public void print() {
      for (int i = 0; i < count; i++) {
         System.out.println(items[i]);
      }
   }
}