fun main(args: Array<String>) {
    var idade = 0
    var ingresso = 18
    var desconto = 0.0
    var x = 0
    var quantidade = 0

    print("Digite sua idade: ")
    idade = readLine()!!.toInt()

    print("Digite a quantidade de ingressos que deseja comprar: ")
    quantidade = readLine()!!.toInt()

    if(idade >= 0 && idade < 5){
    x = 60
        desconto = ingresso.toDouble() * x / 100
        println("O seu ingresso sairá por R$ $desconto.")
    }else if(idade > 60){
        x = 55
        desconto = ingresso.toDouble() * x / 100
        println("O seu ingresso sairá por R$ $desconto.")
    }else if(idade >= 5 && idade <= 60 && quantidade >= 2){
        x = 30
        desconto = ingresso.toDouble() * quantidade * x / 100
        println("O seu pedido sairá por R$ $desconto.")
    }
    else{
        println("Você pagará R$ $ingresso.")
    }
}