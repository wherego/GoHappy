package com.example.liujianhui.gohappy.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * 限定音乐url范围
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MusicUrl {
}