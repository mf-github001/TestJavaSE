package com.mf.anno3;

/**
 * @Auther: mf
 * @Date: 2022/12/8 - 12 - 08 - 16:20
 */
@MyAnnotation2
public class Student {

}
 enum ElementType {
    /** Class, interface (including annotation type), or enum declaration */
    @SuppressWarnings("unused")
    TYPE,
     @SuppressWarnings("unused")
    /** Field declaration (includes enum constants) */
    FIELD,
     @SuppressWarnings("unused")
    /** Method declaration */
    METHOD,
     @SuppressWarnings("unused")
    /** Formal parameter declaration */
    PARAMETER,
     @SuppressWarnings("unused")
    /** Constructor declaration */
    CONSTRUCTOR,
     @SuppressWarnings("unused")
    /** Local variable declaration */
    LOCAL_VARIABLE,
     @SuppressWarnings("unused")
    /** Annotation type declaration */
    ANNOTATION_TYPE,
     @SuppressWarnings("unused")
    /** Package declaration */
    PACKAGE,
     @SuppressWarnings("unused")
    /**
     * Type parameter declaration
     *
     * @since 1.8
     */
    TYPE_PARAMETER,

    /**
     * Use of a type
     *
     * @since 1.8
     */ @SuppressWarnings("unused")
    TYPE_USE
}

