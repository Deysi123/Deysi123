//Sumar 10+9+8, etc con recursividad

object FuncionesRecursivas {
    
  def sumatoriaEnterosIterativa(numero:Int): Int={
    var sumatoria=0
    var noAnterior=numero
    
    while(noAnterior>0){
      
      sumatoria=sumatoria+(noAnterior)
      noAnterior=noAnterior-1
    }
    
    sumatoria
  }
  
  //Sumatoria de enteros desde un limite inferior hastalimite superior
  def sumaEnterosConLimitesIterativa(li: Int, ls:Int): Int={
   var sumatoria=0
   
    var limiteInferior=li
    var limiteSuperior=ls
    
    while(limiteSuperior>=limiteInferior){
      
      sumatoria=sumatoria+(limiteSuperior)
      limiteSuperior-=1
    }
   
   sumatoria
  }
  
  def sumaEnterosConLimitesRecursiva(li: Int, ls:Int): Int={
   
    if(ls<li)
      0
    else
      return ls+sumaEnterosConLimitesRecursiva(li,ls-1)
  }
  
  /*def sumatoriaEnteros(numero: Int): Int={
    if(numero==0)
      0
    else
      return numero+sumatoriaEnteros(numero-1)
  }*/
  
  def main(args: Array[String]): Unit = {
    //println(sumatoriaEnteros(10))
    //println(sumatoriaEnterosIterativa(10))
    //println(sumaEnterosConLimitesIterativa(5,10))
    println(sumaEnterosConLimitesRecursiva(5,10))
  }
}