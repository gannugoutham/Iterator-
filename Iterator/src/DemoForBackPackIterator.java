
public class DemoForBackPackIterator {
	
	public static void main(String[] args) {  
        BackPackCompanyIterator backPacks = new BackPackCompanyIterator();  
        System.out.println("Backpacks list....");  
        for(Iterator iter = backPacks.getIterator(); iter.hasNext();){  
            String backPack = (String)iter.next();  
            System.out.println(backPack);  
         }      
  }  

}
