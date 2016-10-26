
package testnestedclases;
import static java.lang.System.out;


public class scintests { private mode mode;
            public scintests ()
            {
                
                mode= new teatchmode ();
            }
            
            public void whathedo ()
            {
                mode.doo();
                
            }
            
            public void whathedrink ()
            {
                mode.drink();
                
            }
            public void movetoteatchmode()
            {
                mode=new teatchmode ();
                
            }
            public void movetoadmmode()
            {
                mode=new admmode ();
                
            }
    public void movetowritemode()
            {
                mode=new writemode ();
                
                
            }
    
    private interface mode{
        void doo();
        void drink();
        }
    private class writemode implements mode {
        
        public void doo(){
            out.println("write");
            }
        public void drink()
        {
            out.println("drink cofee");
            
        }
        
    }
            
          private class teatchmode implements mode {
        
        public void doo(){
            out.println("teatch");
            }
        public void drink()
        {
            out.println("drink tea");
            
        }
        
    }   
            private class admmode implements mode {
        
        public void doo(){
            out.println("adm");
            }
        public void drink()
        {
            out.println("drinkwater");
            
        }
        
    }
           
}
