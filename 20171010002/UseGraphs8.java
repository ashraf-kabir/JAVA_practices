import java.io.*;
import java.util.*;

class UseGraphs8
{
// Path search, breadth-first, using queue
// With cycle test
    
    private static int count;
    
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file;
        System.out.print("Enter name of file for graph: ");
        file = new BufferedReader(new FileReader(in.readLine().trim()));
        Graph1 graph = new Graph1(file);
        file.close();
        System.out.print("Enter start node: ");
        String start = in.readLine().trim();
        System.out.print("Enter finish node: ");
        String finish = in.readLine().trim();
        count = 0;
        String p = path(start,finish,graph);
        System.out.println("Path (after considering "+count+" paths) is: ");
        System.out.println(p);
    }
    
    public static String path(String start,String finish,Graph1 graph)
    {
        Cell p = findPath(start,finish,graph);
        if(p==null)
            return "No path possible";
        else
        {
            String str = p.first;
            p = p.next;
            while(p!=null)
            {
                str=p.first+","+str;
                p=p.next;
            }
            return "["+str+"]";
        }
    }
    
    private static Cell findPath(String start,String finish,Graph1 graph)
    {
        Queue q = new Queue();
        q.join(new Cell(start,null));
        while(!q.isEmpty())
        {
            Cell done = (Cell)q.first();
            count++;
            if(done.first.equals(finish))
                return done;
            else
            {
                q.leave();
                Enumeration enum = graph.getLinks(done.first);
                while(enum.hasMoreElements())
                {
                    String next = (String)enum.nextElement();
                    if(!member(next,done))
                        q.join(new Cell(next,done));
                }
            }
        }
        return null;
    }
    
    private static boolean member(String node,Cell list)
    {
        Cell ptr;
        for(ptr=list; ptr!=null&&!ptr.first.equals(node); ptr=ptr.next);
        return ptr!=null;
    }
    
    private static class Cell
    {
        String first;
        Cell next;
        
        Cell(String f,Cell n)
        {
            first=f;
            next=n;
        }
    }
}