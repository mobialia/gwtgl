GwtGL
=====

This is a fork of the original GwtGL project at http://code.google.com/archive/p/gwtgl used in the
JMini3d library.

It uses the standard GWT TypedArrays implementation included in GWT instead the previous custom
implementation.

This version is also simplified using ints instead custom objects (WebGLUniformLocation,
WebGLTexture and WebGLBuffer), making it more similar to the Android OpenGl version.

What is GwtGL?
==============

GwtGL provides a basic GWT widget and binding for the WebGL standard.

GwtGL enables you to develop 3D websites and web applications using the Java programming language
instead of JavaScript. Type safety and the Java Toolset help you to write your apps in less time
compared to plain JavaScript development. The GWT compiler generates optimized JavaScript code,
so you will achieve higher frame rates.

What is WebGL?
==============

WebGL is a graphics API based on OpenGL ES 2.0. It enables developers to create hardware accelerated
3D graphics which can be embedded into HTML websites. All mayor browsers upport WebGL.

Build
=====
The build system was converted to gradle and the demos removed. To install it in the local maven
repository:

```
gradle clean publishToMavenLocal
```