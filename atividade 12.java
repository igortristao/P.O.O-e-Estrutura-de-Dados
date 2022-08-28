pacote  Atividade ;

importar  java . útil . Scanner ;

 classe  pública questão 12 {
    public  static  void  main ( String [] args ) {
        Scanner  enterScanner = new  Scanner ( System . in );
        duplo  A , B , C , pi ;
        A = digite Scanner . próximoDouble ();
        B = digite Scanner . próximoDouble ();
        C = digite Scanner . próximoDouble ();
        pi = 3,14159 ;

        duplo  TRIÂNGULO ;
         CÍRCULO duplo ;
        duplo  TRAPEZIO ;
        duplo  QUADRADO ;
        duplo  RETANGULO ;
        TRIÂNGULO = ( A * C )/ 2 ;
        CÍRCULO = ( pi * ( C * C ));
        TRAPEZIO = (( A + B ) * C )/ 2 ;
        QUADRADO = ( B * B );
        RETANGULO = ( A * B );

        Sistema . fora . printf ( " TRIÂNGULO: %.3f" , TRIÂNGULO );
        Sistema . fora . printf ( " CIRCULO: %.3f" , CIRCULO );
        Sistema . fora . printf ( " TRAPEZIO: %.3f" , TRAPEZIO );
        Sistema . fora . printf ( " QUADRADO: %.3f" , QUADRADO );
        Sistema . fora . printf ( " RETANGULO: %.3f" , RETANGULO );





    }
}