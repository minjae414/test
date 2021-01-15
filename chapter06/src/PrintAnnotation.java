import java.lang.annotation.*;	//������ ���µ�??

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
