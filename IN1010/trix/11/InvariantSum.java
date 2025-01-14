class InvariantSum {
    public static void main(String[] args) {
        int[] tall = {1,2,3,4,5};
        int sum = 1;
        for (int i = 0; i < tall.length; i++) {
            sum += tall[i];
        }

        System.out.println(sum);
    }
}

// invarianten som er at sum foer hver iterasjon
// er lik summen av alle tallene fra og med 0 tilogmed i-1
// i arrayet, holder ikke, for den vil alltid vaere like
// den faktiske summen, pluss en
