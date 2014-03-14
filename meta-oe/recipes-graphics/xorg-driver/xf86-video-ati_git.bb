require recipes-graphics/xorg-driver/xorg-driver-video.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=aabff1606551f9461ccf567739af63dc"

SUMMARY = "X.Org X server -- ATI Radeon video driver"

DESCRIPTION = "Open-source X.org graphics driver for ATI Radeon graphics"

DEPENDS += "virtual/libx11 libxvmc drm xf86driproto glproto \
            virtual/libgl xineramaproto libpciaccess glamor"
RDEPENDS_${PN} += "xserver-xorg-module-exa"

COMPATIBLE_HOST = '(i.86|x86_64).*-linux'

PV = "7.3.0+git${SRCPV}"
SRC_URI = "git://anongit.freedesktop.org/xorg/driver/xf86-video-ati"
SRCREV = "515bcf14d514f9dcaaf30fd0bf1ef6dd6ba9a0cd"

S = "${WORKDIR}/git"

