/**
 * Created by java on 23.12.2016.
 */
class CoinTest extends spock.lang.Specification {
    def 'should create coin eith negative diametre and throw CoinLogicException'()

    when:'pass negative diametr'
    new Coin (weight, diameter);

    then:
    weight << 12
    diameter << -1
}
