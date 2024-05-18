package polemorfizm

class DiagramClass {
}

//Диаграмма 1
open class Click { }
class Clack : Click() { }


//Диаграмма 2
open class Top { }
class Tip : Top() { }


//Диаграмма 3
abstract class Alpha { }
class Omega : Alpha() { }


//Диаграмма 4
open class Foo { }
open class Bar : Foo() { }
class Baz : Bar() { }


//Диаграмма 5
interface Fi { }
open class Fee : Fi { }
class Fo : Fee() { }
class Fum : Fo() { }

//2-е Задание
interface Flyable{
    val x:String
    fun fly(){
        println("$x is flying")
    }
}

class Bird : Flyable{
    override val x="Bird"
}

class Plane : Flyable{
    override val x="Plane"
}
class Superhero : Flyable{
    override val x="Superhero"
}

fun main(args: Array<String>){
    val f= arrayOf(Bird(),Plane(),Superhero())
    var x=0
    while (x in 0..2){
        when(f[x]){
            is Bird->{
                x++
                f[x].fly()
            }
            is Plane,is Superhero->f[x].fly()
        }
        x++
    }
}