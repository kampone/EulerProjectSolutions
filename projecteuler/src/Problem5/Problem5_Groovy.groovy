package Problem5

class Problem5_Groovy {

    static nok(IntRange range){
        long currentNok = 1

        range.each {
            currentNok = nok(currentNok, it)
        }
        currentNok
    }

    static nok(long a, long b){
        (a*b)/nod(a,b)
    }

    static nod(long a, long b){
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

    static void main(String[] args) {
      print nok(1..20)
    }

}
