package matcher;

import java.lang.reflect.Method;

public class SayPrefixMethodMatcher implements MethodMatcher {

    @Override
    public boolean matches(Method method, Class targetClass, Object[] args) {
        return method.getName().startsWith("say");
    }
}
