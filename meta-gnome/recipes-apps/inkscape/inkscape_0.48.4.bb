DESCRIPTION = "Inkscape is an SVG-based graphics editor featuring alpha \
blending, node editing, SVG to PNG export, and more. Its goal is for features \
similar to Illustrator, CorelDraw, Visio, etc."

DEPENDS = "poppler gsl libgc intltool-native gtk+ gtkmm glibmm libart-lgpl libxslt librsvg libxml2 libsigc++-2.0 popt boost"

LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0597d53b8f2dba85c174c771eead1324 \
                    file://COPYING.LIB;md5=58536dbdbca839fcfc5366fa07bfa758"

#we know that GC version is 6.5, so we patch out the version check, since gc_open was already detected
SRC_URI = "${SOURCEFORGE_MIRROR}/inkscape/inkscape-${PV}.tar.bz2 \
           file://no-boehm-version-check.patch \
           file://0001-Fix_Datamatrix_UI_issue.patch \
           file://0002-Drop_PS_and_PDF_support_in_MimeType.patch \
           file://0003-Fix_LP_-911146.patch \
           file://0004-Fix_FTBFS_on_gcc-4.8.patch \
"


SRC_URI[md5sum] = "47bd8546e42ba396624eef9eb66b9b6c"
SRC_URI[sha256sum] = "8741ad8cbb5aa5cee4f234ebc45479cff2479b16d903870693174bdede8a519d"

S = "${WORKDIR}/inkscape-${PV}"

inherit autotools gettext mime gtk-icon-cache

