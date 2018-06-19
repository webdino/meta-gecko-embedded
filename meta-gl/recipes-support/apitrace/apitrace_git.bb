DESCRIPTION = "ls for tracing OpenGL, Direct3D, and other graphics APIs"
SECTION = "devel" 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aeb969185a143c3c25130bc2c3ef9a50" 
PR = "r0" 

DEPENDS = "libx11 libpng procps"

SRC_URI = "git://github.com/apitrace/apitrace.git;protocol=https \
           file://0001-Disable-multiarch-support-to-prevent-invalid-install.patch \
          "
SRCREV = "9b9eb3d955b2464006a0790470be6d8f8ee14fe6"

S = "${WORKDIR}/git"

inherit cmake pythonnative

FILES_${PN}-dbg += "${libdir}/apitrace/wrappers/.debug"
