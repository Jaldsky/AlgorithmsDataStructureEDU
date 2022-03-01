package adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rPeg = new RoundPeg(5);
        if (hole.fits(rPeg)) {
            System.out.println("Round peg r5 fit round hole r5");
        }

        SqarePeg smallPeg = new SqarePeg(2);
        SqarePeg largePeg = new SqarePeg(20);
//       hole.fits(smallPeg); //не скомпилируется

         SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallPeg);
         SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largePeg);
         if(hole.fits(smallSqPegAdapter)) {
             System.out.println("Square peg w2 fits hole r");
         }
         if (!hole.fits(largeSqPegAdapter)) {
             System.out.println("Square peg w20 doesnt fit into round hole r5");
         }
    }
}
