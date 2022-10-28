public class SatisfacaoFactory {
    public static ISatisfacao calcularSatisfaçãoDaEmpresa(String TipoSatisfacao){
        Class novaClasse = null;
        Object novoObjeto = null;

        try{
            novaClasse = Class.forName(TipoSatisfacao);
            novoObjeto = novaClasse.newInstance();
        }catch (Exception ex){
            throw new IllegalArgumentException("Tipo de satisfação não encontrado");
        }
        if (!(novoObjeto instanceof ISatisfacao)) {
            throw new IllegalArgumentException("Satisfação inválida");
        }
        return (ISatisfacao) novoObjeto;
    }

}
