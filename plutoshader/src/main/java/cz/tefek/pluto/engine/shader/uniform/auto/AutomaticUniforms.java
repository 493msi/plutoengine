package cz.tefek.pluto.engine.shader.uniform.auto;

import org.joml.Matrix4fc;

import cz.tefek.pluto.event.lambda.LambdaEventFactory;
import cz.tefek.pluto.event.lambda.LambdaEventFactory.LambdaEvent;

public class AutomaticUniforms
{
    public static final LambdaEvent<Matrix4fc> VIEWPORT_PROJECTION = LambdaEventFactory.createEvent();
}
