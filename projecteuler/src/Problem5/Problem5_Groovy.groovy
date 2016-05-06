package Problem5

class Problem5_Groovy {

    def static nok(IntRange range){
        long currentNok = 1

        range.each {
            currentNok = nok(currentNok, it)
        }
        currentNok
    }

    def static nok(long a, long b){
        (a*b)/nod(a,b)
    }

    def static nod(long a, long b){
        if(b > a){
            def c = a
            a = b
            b = c
        }
        def r = a % b
        while(r != 0){
            a = b
            b = r
            r = a % b
        }
        b
    }

    public static void main(String[] args) {
      print nok(1..20)
    }

}
