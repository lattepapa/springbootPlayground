# Java Springboot Playground

![Lang](https://img.shields.io/badge/lang-java-orange)
![Framework](https://img.shields.io/badge/framework-springboot-green)

![IDE](https://img.shields.io/badge/ide-intellij-blue)
![Hydra](https://img.shields.io/badge/hail-hydra-red)

이 공간은 전적으로 초심자가 Java Springboot을 배워가는 과정을 기록한 곳 입니다.

Java 프로그래밍에 관한 대부분의 사실들은 이곳에서 보고 들은 내용들을 토대로 하였습니다.  
https://fastcampus.co.kr/dev_online_javaend  
https://jojoldu.tistory.com

## 개발환경 세팅

### jenv 설치

1. homebrew를 설치합니다.  
```shell
% /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```  
2. jenv를 설치합니다.  
```shell
% brew install jenv
```
3. (추가)oh-my-ZSH를 설치 및 테마 세팅을 합니다.
```shell
% sh -c "$(curl -fsSL https://raw.githubusercontent.com/robbyrussell/oh-my-zsh/master/tools/install.sh)"

% open -e ~/.zshrc
...
# 아래부분의 값을 원하는 테마로 수정
ZSH_THEME="agnoster"
...

% git clone https://github.com/zsh-users/zsh-syntax-highlighting.git

% echo "source ${(q-)PWD}/zsh-syntax-highlighting/zsh-syntax-highlighting.zsh" >> ${ZDOTDIR:-$HOME}/.zshrc
```

### Open JDK 8 설치
1. AdoptOpenJDK 8 설치
```shell
$ brew tap AdoptOpenJDK/openjdk

$ brew install --cask adoptopenjdk8
```

2. jenv와 AdoptOpenJDK 8 연결
```shell
$ jenv add /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
```

만약 다음과 같은 문제가 생긴다면, 이에 맞게 jenv 설치경로에 직접 AdoptOpenJDK 8 정보를 추가한 후 해당 버전을 글로벌 버전으로 사용하도록 설정합니다.([참고](https://cozzin.tistory.com/64))

```shell
$ jenv add /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
ln: /Users/user/.jenv/versions/openjdk64-1.8.0.292: No such file or directory

$ mkdir -p ~/.jenv/versions

$ jenv add /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home

$ jenv global 8
```
이제 다음과 같이 Open JDK 8 버전이 정상적으로 설치되어 글로벌에서 사용되고 있음이 확인됩니다.
```shell
$ jenv versions
  system
* 1.8 (set by /Users/siwoobaek/.jenv/version)
  1.8.0.292
  openjdk64-1.8.0.292

$ java -version
openjdk version "1.8.0_292"
OpenJDK Runtime Environment (AdoptOpenJDK)(build 1.8.0_292-b10)
OpenJDK 64-Bit Server VM (AdoptOpenJDK)(build 25.292-b10, mixed mode)

$ /usr/libexec/java_home -V
Matching Java Virtual Machines (1):
    1.8.0_292 (x86_64) "AdoptOpenJDK" - "AdoptOpenJDK 8" /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
/Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home
```

### IDE 설치

저는 **IntelliJ Ultimate Edition**을 구독 중입니다. 참고로, Java Springboot를 위한 무료 IDE로는 IntelliJ Community Edition이나 STS(Eclipse)도 있습니다.

## 프로젝트 구성

### 패키지 구조
- `aws.springbuls` : OAuth 2.0을 활용한 간단한 스프링부트 게시판 CRUD
- `fast.driller` : Java Springboot 기본 문법구조 및 알고리즘을 포함한 스프링부트 프로젝트 꾸러미

패키지 구조는 위와 같이 크게 두 가지로 나뉘어져 있습니다. 해당 패키지로 구현되는 모습은 각각의 README.md 파일을 통해 확인할 수 있습니다.