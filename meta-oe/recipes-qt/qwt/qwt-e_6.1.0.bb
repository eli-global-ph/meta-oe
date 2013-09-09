inherit qt4e

require qwt.inc

SRC_URI[qwt.md5sum] = "aef0437b37f191067a6a9dc01c30ba64"
SRC_URI[qwt.sha256sum] = "a7e3d9f1db917d186a973c5f04a316bc9607c7c35794d7a16de323aba5e17402"

RPROVIDES_${PN}-dev = "libqwt-dev"

# Conflicts with qwt, only one qwt* can be built in world
# | Project ERROR: local build will conflict with sysroots/qemuarm/usr/lib/libqwt.*
EXCLUDE_FROM_WORLD = "1"
