require gtk+3.inc

MAJ_VER = "${@oe.utils.trim_version("${PV}", 2)}"

SRC_URI = "http://ftp.gnome.org/pub/gnome/sources/gtk+/${MAJ_VER}/gtk+-${PV}.tar.xz \
           file://hardcoded_libtool.patch \
           file://Dont-force-csd.patch \
           file://Do-not-try-to-initialize-GL-without-libGL.patch \
           file://0001-Add-disable-opengl-configure-option.patch \
           file://wayland-memfd-fallback.patch \
           file://downgrade-xdg-shell.patch \
          "

SRC_URI[md5sum] = "c7a5b21d28572bb1d6fc8803864618c0"
SRC_URI[sha256sum] = "783d7f8b00f9b4224cc94d7da885a67598e711c2d6d79c9c873c6b203e83acbd"

S = "${WORKDIR}/gtk+-${PV}"

LIC_FILES_CHKSUM = "file://COPYING;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
                    file://gtk/gtk.h;endline=25;md5=1d8dc0fccdbfa26287a271dce88af737 \
                    file://gdk/gdk.h;endline=25;md5=c920ce39dc88c6f06d3e7c50e08086f2 \
                    file://tests/testgtk.c;endline=25;md5=cb732daee1d82af7a2bf953cf3cf26f1"
