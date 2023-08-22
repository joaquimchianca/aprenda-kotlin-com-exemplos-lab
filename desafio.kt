// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: Set<ConteudoEducacional>) {

    val inscritos = mutableSetOf<Usuario>()

    fun getNumInscritos(): Int = inscritos.size

    fun matricular(usuario: Usuario) {
        if (!inscritos.add(usuario)) println("erro: impossivel adicionar usuario")
    }

    fun matricularTodos(vararg usuarios: Usuario) {
        if (!inscritos.addAll(usuarios)) println("erro: impossivel adicionar usuarios")
    }

    fun remover(usuario: Usuario) {
        if (!inscritos.remove(usuario)) println("erro: impossivel remover usuario")
    }

    fun removerTodos(vararg usuarios: Usuario) {
        if (!inscritos.removeAll(usuarios)) println("erro: impossivel remover usuarios")
    }
}

fun main() {

    val cursoKotlin = ConteudoEducacional("Lógica de programação com Kotlin")
    val cursoArquiteturaAndroid = ConteudoEducacional("Arquitetura Android com Kotlin na prática")
    val cursoSpringComKotlin = ConteudoEducacional("Desenvolva uma API com Spring e Kotlin")


    val formacaoBackEnd = Formacao("Formação Spring Boot com Kotlin",Nivel.INTERMEDIARIO, setOf(cursoKotlin, cursoSpringComKotlin))
    val formacaoAndroid = Formacao("Formação Android com Kotlin", Nivel.INTERMEDIARIO, setOf(cursoKotlin, cursoArquiteturaAndroid))

    println("Inscritos totais na formacao Android: " + formacaoAndroid.getNumInscritos())
    println("Inscritos totais na formacao Backend: " + formacaoBackEnd.getNumInscritos())

    //=== TESTE MATRICULA
    println("\nMatriculando alunos nas formações...")
    formacaoAndroid.matricular(Usuario())
    formacaoBackEnd.matricularTodos(Usuario(), Usuario(), Usuario())
    println("Inscritos totais na formacao Android: " + formacaoAndroid.getNumInscritos())
    println("Inscritos totais na formacao Backend: " + formacaoBackEnd.getNumInscritos())

    println("\nAdicionando 2 vezes um usuário específico")
    val u1 = Usuario()
    formacaoAndroid.matricular(u1)
    formacaoAndroid.matricular(u1)
    println("Inscritos totais na formacao Android: " + formacaoAndroid.getNumInscritos())
    // deve retornar 2

    //=== TESTE REMOÇÃO
    println("\nremovendo alunos...")
    formacaoAndroid.remover(u1)

    // remocao de usuario sem estar no conjunto de conteudos
    formacaoBackEnd.remover(Usuario())
    println("Inscritos totais na formacao Android: " + formacaoAndroid.getNumInscritos())
    println("Inscritos totais na formacao Backend: " + formacaoBackEnd.getNumInscritos())

    formacaoBackEnd.run {
        val u2 = Usuario()
        val u3 = Usuario()
        val u4 = Usuario()

        this.matricularTodos(u2,u3,u4)
        println("\nquantidade de inscritos formação back end: " + this.getNumInscritos())

        println("removendo inscritos...")
        this.removerTodos(u2,u3,u4)
        println("quantidade de inscritos formação back end: " + this.getNumInscritos())
    }

}
