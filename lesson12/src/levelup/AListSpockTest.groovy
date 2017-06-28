package levelup

class AListSpockTest extends spock.lang.Specification {

    def 'chek is add element correct'(){
        given: 'initializa AList'
        AList list = new AList();

        when: 'Try to add one element'
        list.add(num)

        then: 'chek list size'
        list.size() == 1

        where:
        num << [0, 5 , 7, 256]
    }

}
