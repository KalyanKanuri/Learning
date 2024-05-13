class TryCatch {
    public void ExecTryCatch() {
        int i = 0;
        int j = 0;
        try {
            j = 10/i;
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("Something went wrong " +e);
        }
    }
}

class TryMultiCatch {
    public void ExecTryMultiCatch() {
        int i = 0;
        int j = 0;
        try {
            j = 10/i;
            System.out.println(j);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Arithmetic or NullPointer error " +e);
        } catch (Exception e) {
            System.out.println("Something went wrong " +e);
        }
    }
}

class ThrowCatch {
    public void ExecThrowCatch(String s) {
        if(s == null) {
            throw new NullPointerException("String is null");
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class DuckingException {
    public void ExecDuckingException() throws CustomException {
        throw new CustomException("this is a newly defined Exception");
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        TryCatch  tc = new TryCatch();
        tc.ExecTryCatch();

        TryMultiCatch tmc = new TryMultiCatch();
        tmc.ExecTryMultiCatch();

        ThrowCatch tcc = new ThrowCatch();
        try {
            tcc.ExecThrowCatch(null);
            System.out.println("String is not null");
        } catch (NullPointerException e) {
            System.out.println("Incorrect String passage " +e);
        }

        CustomException ce = new CustomException("this is a newly defined Exception");
        try {
            throw ce;
        } catch (CustomException e) {
            System.out.println("Defined a custom exception " +e);
        }

        DuckingException de = new DuckingException();
        try {
            de.ExecDuckingException();
        } catch (CustomException e) {
            System.out.println("Invoking Custom Exception using Ducking Exception concept " +e);
        }
    }
}
