package com.github.chengzhx76.reactor;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * @desc:
 * @author: hp
 * @date: 2019/5/9
 */
public class TestReactor {


    public void test01() {
//        Flux.just(1, )
        Integer[] array = new Integer[]{1,2,3,4,5,6};
        Flux.fromArray(array);
        // 只有完成信号的空数据流
        Flux.just();
        Flux.empty();
        Mono.empty();
        Mono.justOrEmpty(Optional.empty());
        // 只有错误信号的数据流
        Flux.error(new Exception("some error"));
        Mono.error(new Exception("some error"));
    }

    @Test
    public void test02() {
        Flux.just(1, 2, 3, 4, 5, 6).subscribe(System.out::print);
    }

    @Test
    public void test03() {
        Flux.just(1, 2, 3, 4, 5, 6).subscribe(
                System.out::println,
                System.err::println,
                () -> System.out.println("Completed!"));
    }
    @Test
    public void test04() {
        Mono.error(new Exception("some error")).subscribe(
                System.out::println,
                System.err::println,
                () -> System.out.println("Completed!")
        );
    }

}
