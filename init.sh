git clone --recurse-submodules https://github.com/SkriptLang/Skript.git
cd ./Skript
./gradlew build
cd ..
git clone  --recurse-submodules https://github.com/SoakProject/Soak-Plugin
rm -rf ./Soak-Plugin/.git
rm -rf ./Soak-Plugin/.github
rm -rf ./Soak-Plugin/.idea
cp -R -n ./Soak-Plugin/* .
rm -rf ./Soak-Plugin

