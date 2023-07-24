class Man(name:String):Human(name) {
    override fun eat() {
        println("${name}大口吃")
    }

    override fun pee() {
        println("${name}男的站着尿")
    }
}