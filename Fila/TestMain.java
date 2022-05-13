public class Main
{
	public static void main(String[] args)
	{
	    Fila<String> fil = new Fila<String> ();
	    
	    try
	    {
    	    fil.guardeUmItem("PYTHON");
    	    fil.guardeUmItem("C");
    	    fil.guardeUmItem("JAVA");
    	    fil.guardeUmItem("C++");
    	    fil.guardeUmItem("HTML");
    	    
    	    System.out.println (fil.recupereUmItem());
    	    fil.removaUmItem   ();
    	    System.out.println (fil.recupereUmItem());
    	    fil.removaUmItem   ();
    	    System.out.println (fil.recupereUmItem());
    	    fil.removaUmItem   ();
	    }
	    catch (Exception erro)
	    {
	        System.err.println (erro.getMessage());
	    }
	}
}