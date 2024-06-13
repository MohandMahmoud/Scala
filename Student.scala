class Student(val id :Int,val Name :String ) {
  var age = 5;
  def this(i:Int,n:String,a:Int) {
    this(i,n)
    age = a
  }
  def displayinfo(): Unit = {
    println("name is",Name)
    println("id is",id)
  }
}

class master (val idd :Int,val Namev :String , val ager : Int) extends Student(idd,Namev){
  override def displayinfo(): Unit = {
    super.displayinfo()
    println("age is",ager)

  }
}