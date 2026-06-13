public class Validar_User {
    public static void Validar( Integer idade , String email ) throws Idade_Invalida_Exception, Email_Invalido_Exception {
        if ( idade < 18 ){
            throw new Idade_Invalida_Exception("IDADE INVÁLIDA: " + idade );
        } else if ( !email.contains("@") || !email.contains(".com") ) {
            throw new Email_Invalido_Exception("EMAIL INVÁLIDO: " + email );
        }
    }
}
