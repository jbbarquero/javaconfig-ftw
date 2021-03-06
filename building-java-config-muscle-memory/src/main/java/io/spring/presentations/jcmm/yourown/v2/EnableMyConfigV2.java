
package io.spring.presentations.jcmm.yourown.v2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;

/**
 * If you want to support annotations you need a level of indirection. Here we import
 * an {@link ImportSelector} so that we can access the attributes.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MyConfigImportSelector.class)
public @interface EnableMyConfigV2 {

	public boolean showCopyright() default false;

}
