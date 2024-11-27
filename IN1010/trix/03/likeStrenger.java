class likeStrenger{
    public static void main(String [] args){
        String navn1 = new String("Maria");
        String navn2 = new String("Maria");

        if(navn1.equals(navn2)){
            System.out.println("Navnene er like!");
        } else {
            System.out.println("Navnene er ikke like!");
        }
    }
}


// Naar programmet sjekker om navn1 == navn2, saa sjekker det om de
// Referer til det samme objektet. I dette tilfellet gjoer de ikke det.
// Derimot hadde navn1 == navn2 gitt true.
// For aa sjekke om to strenger semantisk sett er like, maa man bruke .equals()
