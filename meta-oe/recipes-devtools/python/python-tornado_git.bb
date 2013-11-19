DESCRIPTION = "Tornado is an open source version of the scalable, non-blocking web server and tools that power FriendFeed."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://README.rst;md5=b34308b7b58b086690bf3d59ea9f3b28"

PV = "3.1.1"
SRCREV = "495c94f6329e457bc5678e4aa38c228f8e93a4c8"
SRC_URI = "git://github.com/facebook/tornado.git;branch=branch3.1 \
          "

S = "${WORKDIR}/git"

inherit setuptools


