#!/bin/env sh
if [ -f ".temp" ]; then
  rm -r ./.temp/
fi

mkdir ./.temp/
cp ../out/artifacts/jpwd_jar/jpwd.jar ./.temp/
cp ./jpwd.sh ./.temp/


cd ./.temp

ls

VER="$1"
echo "Create tar file to jpwd $VER ..."
TARNAME=jpwd-"$VER".tar.gz
tar -cvf "./$TARNAME" ./jpwd.sh ./jpwd.jar

cd ../..
if ! [ -f "./release" ]; then
  echo "Create release file"
  mkdir release 
fi

echo "Move the $TARNAME to release directory."

mv "./scripts/.temp/$TARNAME" ./release

echo "Remove temp folder"
rm -r ./scripts/.temp
