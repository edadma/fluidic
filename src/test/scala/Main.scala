import xyz.hyperreal.liquescent.Testing


object Main extends Testing with App {

  val res =
    test(
      """
        |{% layout 'asdf' %}
        |{{ '#7ab55c' | color_to_rgb }}
      """.trim.stripMargin, false
    )

  println( s"|$res|" )

}