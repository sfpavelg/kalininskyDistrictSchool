//package I_encapsulationAndStatic;
//
//public class AccountHacking extends Money{
//
//    @Override
//    public int request(int request){
//        System.out.println("Даже переопределив метод request, и понизив доступ к paymentOfTheMoney, " +
//               "\nмы не сможем переопределить и изменить функционал paymentOfTheMoney, если он статический!");
//        return  paymentOfTheMoney(request); //
//    }
////
//    @Override //Метод обхода ограничения по снятию средств
//    public  int paymentOfTheMoney(int request) {
//
//        return getCashAccount();
//    }
//
//
//}
