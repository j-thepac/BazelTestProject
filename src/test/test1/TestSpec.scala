import org.scalatest.FunSpec
import org.scalamock.scalatest.MockFactory
import src.main.unittest._


class TestSpec extends FunSpec with MockFactory
{
  describe("simpleTest_1") {
    this.simpleTest_1()
  }

  def simpleTest_1(): Unit = {
    describe("extract") {
      it( "simple test")
      {
                  val a:A=new A()
        val m:TestA=mock[TestA]
        assert(1==1)

      }
    }
  }

}
