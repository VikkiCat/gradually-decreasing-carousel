package com.epam.rd.autotasks;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(
            final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run(){
        if (isRunCalled){
            return null;
        }
        isRunCalled = true;
        return new GraduallyDecreasingCarouselRun();
    }
}
