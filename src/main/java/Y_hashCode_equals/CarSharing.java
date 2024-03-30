package Y_hashCode_equals;



/**
 * Два случая для переопределения hashCode() и equals()
 * Первый, геолокация должна распознать и передать только те объекты, которые принадлежат конкретной компании
 * и являются каршерингом.
 * Второй случай, когда нужна конкретная машина, с конкретными паспортными данными, без учёта компании
 * и принадлежности к типу каршеринга, так как машина может быть продана в личное пользование.
 *
 * В данном примере объект распознаётся как каршеринг.
 * То есть объекты будут равны, если эта машина каршеринг данной компании.
 */
public class CarSharing {
    private String company; //Принадлежность к компании
    private String carSharingTrue; //это поле указывает что это каршеринг, личный транспорт или служебная машина.
    private String[] passport; //Паспортные данные машины

    public CarSharing(String company, String carSharingTrue, String[] passport) {
        this.company = company;
        this.carSharingTrue = carSharingTrue;
        this.passport = passport;
    }

    @Override
    public int hashCode() { //hashCode переопределяем исключительно по двум полям.
        final int prime = 31;
        int result = 1;
        result = prime * result + ((company == null) ? 0 : company.hashCode());
        result = prime * result + ((carSharingTrue == null) ? 0 : carSharingTrue.hashCode());
        return result;
    }

    // Для полноты примера, также переопределим метод equals()
    @Override
    public boolean equals(Object obj) {
        //Первая проверка осуществляется на равенство ссылок. Если входная переменная ссылается на тот же объект,
        // на которую ссылается переменная экземпляра, созданного из этого класса, то это один и тот же объект.
        if (this == obj) {
            return true;
        }
        //Вторая проверка осуществляется сначала на null. Если входной объект пустой, значит равенства быть не может
        //Следующая проверка происходит на равенство типов. Если два объекта разных типов, то есть не соответствуют
        //типу CarSharing, в данном случае, то это точно разные объекты.
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Если код дошёл до этой точки, значит входной объект точно не null,
        // входной объект того же типа, что и этот класс,
        // и это не один и тот же объект, имеющий две ссылки.
        CarSharing other = (CarSharing) obj; //создаём дополнительную переменную, что бы привести входной объект obj к типу нашего класса.
        return (this.company == null ? other.company == null : this.company.equals(other.company))
        //Условие выше проверяет, если поле company нашего объекта null, то и входного объекта тоже должно быть null
        //А если не null, то значения должны совпасть.
                && (this.carSharingTrue == null ? other.carSharingTrue == null : this.carSharingTrue.equals(other.carSharingTrue));
        //данная проверка работает по тому же принципу, но для поля carSharingTrue
    }

}
