verus04.gat,63,112,5	script	量産型チャールストン#3	10053,{/* 59481 */
	cutin "dalle03",2;
	mes "[量産型チャールストン]";
	mes "オ客様ヲ確認シマシタ。";
	mes "言語ヲ営業モードニ切リ替エマス。";
	next;
	cutin "dalle01",2;
	mes "[量産型チャールストン]";
	mes "今！　巷で話題沸騰中！";
	mes "チャールストン工場の技術で";
	mes "装備のアップグレードが出来る！";
	next;
	mes "[量産型チャールストン]";
	mes "なんと！";
	mes "今なら素材を持ってくるだけで";
	mes "無料でアップグレード出来ちゃいます！";
	next;
	switch(select("やめる","話を聞く","アップグレードについて聞く","アップグレードする")) {
	case 1:
		mes "[量産型チャールストン]";
		mes "ではまたお会いしましょう。";
		close2;
		cutin "dalle01",255;
		end;
	case 2:
		mes "[量産型チャールストン]";
		mes "私は工場で大量生産された";
		mes "ナンバリングもされていない";
		mes "量産型チャールストンです。";
		next;
		mes "[量産型チャールストン]";
		mes "本当はもっと多くの仲間が";
		mes "居たのですが、";
		mes "工場を脱出する際の戦闘で";
		mes "みんな破壊されてしまいました。";
		close2;
		cutin "dalle01",255;
		end;
	case 3:
		mes "[量産型チャールストン]";
		mes "アップグレードで完成する装備は";
		mes "トルネードアックス[1]";
		mes "ギロチンブレード[3]です。";
		next;
		mes "[量産型チャールストン]";
		mes "どの装備について";
		mes "ご説明しましょうか？";
		mes "　";
		mes "‐^ff0000一部、確認に";
		mes "　画面のスクロールが必要です^000000‐";
		while(1) {
			next;
			switch(select("やめる","トルネードアックス[1]","ギロチンブレード[3]","パイルバンカーS[3]","パイルバンカーP[3]","パイルバンカーT[3]")) {
			case 1:
				mes "[量産型チャールストン]";
				mes "ではまたお会いしましょう。";
				close2;
				cutin "dalle01",255;
				end;
			case 2:
				mes "【トルネードアックス[1]】";
				mes "中型モンスターから";
				mes "受けるダメージ - 10%";
				mes "―――――――――――――";
				mes "[アックストルネード]の";
				mes "再使用待機時間 - 1秒";
				mes "―――――――――――――";
				mes "[トルネードアックス]の";
				mes "精錬値が1上がる度に追加で";
				mes "中型モンスターから";
				mes "受けるダメージ - 1%";
				mes "攻撃速度 + 1%";
				mes "―――――――――――――";
				mes "系列 : ^777777両手斧^000000";
				mes "攻撃 : ^777777320^000000";
				mes "重量 : ^777777400^000000";
				mes "属性 : ^777777風^000000";
				mes "武器レベル : ^7777774^000000";
				mes "要求レベル : ^777777100^000000";
				mes "装備 : ^7777773次職ソードマン系 3次職マーチャント系^000000";
				next;
				mes "[量産型チャールストン]";
				mes "アップグレードを行うには";
				mes "^FF0000ハリケーンフューリー[1]1個^000000";
				mes "^FF0000ウィンドホーク[0]1個^000000";
				mes "^ff0000透明な板（風）50個^000000";
				mes "が必要です。";
				mes "他の装備も見てみますか？";
				continue;
			case 3:
				mes "【ギロチンブレード[3]】";
				mes "人間形モンスターに";
				mes "攻撃命中時、SP + 1";
				mes "―――――――――――――";
				mes "近接物理攻撃で";
				mes "人間形モンスターを倒した時";
				mes "SP + 1";
				mes "―――――――――――――";
				mes "[ギロチンブレード]の";
				mes "精錬値が7以上の時、";
				mes "精錬値が1上がる度に追加で";
				mes "近接物理攻撃で";
				mes "人間形モンスターを倒した時";
				mes "SP + 1";
				mes "―――――――――――――";
				mes "[ギロチンブレード]の";
				mes "精錬値が10の時、追加で";
				mes "人間形モンスターの";
				mes "防御力を無視";
				mes "人間形モンスターに";
				mes "攻撃命中時、SP + 1";
				mes "近接物理攻撃で";
				mes "人間形モンスターを倒した時";
				mes "SP + 10";
				mes "―――――――――――――";
				mes "系列 : ^777777両手剣^000000";
				mes "攻撃 : ^777777200^000000";
				mes "重量 : ^777777350^000000";
				mes "武器レベル : ^7777772^000000";
				mes "要求レベル : ^777777100^000000";
				mes "装備 : ^777777ルーンナイト^000000";
				next;
				mes "[量産型チャールストン]";
				mes "アップグレードを行うには";
				mes "^FF0000ギロチン[0]1個^000000";
				mes "^FF0000エッジ[0]1個^000000";
				mes "^FF0000執行人の手袋50個^000000";
				mes "が必要です。";
				mes "他の装備も見てみますか？";
				continue;
			case 4:
				mes "【パイルバンカーS[3]】";
				mes "物理攻撃命中時、一定確率で";
				mes "敵を氷結状態にする";
				mes "―――――――――――――";
				mes "[パイルバンカーS]の";
				mes "精錬値が7以上の時、";
				mes "精錬値が1上がる度に";
				mes "物理攻撃命中時、";
				mes "敵を氷結状態にする";
				mes "確率が上昇";
				mes "―――――――――――――";
				mes "スキル[パイルバンカー]";
				mes "使用時、敵を凍結状態にする";
				mes "―――――――――――――";
				mes "スキル[パイルバンカー]の";
				mes "再使用待機時間 + 5秒";
				mes "―――――――――――――";
				mes "系列 : ^777777鈍器^000000";
				mes "攻撃 : ^77777750^000000";
				mes "重量 : ^777777350^000000";
				mes "属性 : ^777777水^000000";
				mes "武器レベル : ^7777774^000000";
				mes "要求レベル : ^777777130^000000";
				mes "装備 : ^777777メカニック^000000";
				next;
				mes "[量産型チャールストン]";
				mes "アップグレードを行うには";
				mes "^FF0000パイルバンカー[0]1個^000000";
				mes "^FF0000透明な板（水）10個^000000";
				mes "^FF0000紋章の欠片1　50個^000000";
				mes "が必要です。";
				mes "他の装備も見てみますか？";
				continue;
			case 5:
				mes "【パイルバンカーP[3]】";
				mes "物理攻撃命中時、一定確率で";
				mes "敵を呪い状態にする";
				mes "―――――――――――――";
				mes "[パイルバンカーP]の";
				mes "精錬値が7以上の時、";
				mes "精錬値が1上がる度に";
				mes "物理攻撃命中時、";
				mes "敵を呪い状態にする";
				mes "確率が上昇";
				mes "―――――――――――――";
				mes "スキル[パイルバンカー]";
				mes "使用時、敵を石化状態にする";
				mes "―――――――――――――";
				mes "スキル[パイルバンカー]の";
				mes "再使用待機時間 + 5秒";
				mes "―――――――――――――";
				mes "系列 : ^777777鈍器^000000";
				mes "攻撃 : ^77777750^000000";
				mes "重量 : ^777777350^000000";
				mes "属性 : ^777777地^000000";
				mes "武器レベル : ^7777774^000000";
				mes "要求レベル : ^777777130^000000";
				mes "装備 : ^777777メカニック^000000";
				next;
				mes "[量産型チャールストン]";
				mes "アップグレードを行うには";
				mes "^FF0000パイルバンカー[0]1個^000000";
				mes "^FF0000透明な板（地）10個^000000";
				mes "^FF0000紋章の欠片3　50個^000000";
				mes "が必要です。";
				mes "他の装備もみてみますか？";
				continue;
			case 6:
				mes "【パイルバンカーT[3]】";
				mes "必中攻撃 + 20%";
				mes "―――――――――――――";
				mes "[パイルバンカーT]の";
				mes "精錬値が7以上の時、追加で";
				mes "必中攻撃 + 30%";
				mes "―――――――――――――";
				mes "[ブーストナックル]使用時、";
				mes "一定確率で1秒間、";
				mes "物理攻撃命中時、";
				mes "一定確率で";
				mes "敵を麻痺状態にする";
				mes "―――――――――――――";
				mes "系列 : ^777777鈍器^000000";
				mes "攻撃 : ^77777750^000000";
				mes "重量 : ^777777350^000000";
				mes "属性 : ^777777風^000000";
				mes "武器レベル : ^7777774^000000";
				mes "要求レベル : ^777777130^000000";
				mes "装備 : ^777777メカニック^000000";
				next;
				mes "[量産型チャールストン]";
				mes "アップグレードを行うには";
				mes "^FF0000パイルバンカー[0]1個^000000";
				mes "^FF0000透明な板（風）10個^000000";
				mes "^FF0000紋章の欠片2　50個^000000";
				mes "が必要です。";
				mes "他の装備も見てみますか？";
				continue;
			}
		}
	case 4:
		mes "[量産型チャールストン]";
		mes "アップグレードですね。";
		mes "どれもオススメの超ウルトラ装備です！";
		mes "また、注意事項として";
		mes "^FF0000精錬値や装着されたカードは^000000";
		mes "^FF0000アップグレードを行うと^000000";
		mes "^FF0000失われてしまいます。^000000";
		next;
		mes "[量産型チャールストン]";
		mes "^FF0000もし材料となる装備を複数持っていた場合";
		mes "^FF0000どれを合成に使うかは選択できません。^000000";
		mes "材料以外はすべて倉庫に預けるなど";
		mes "してから、アップグレードを";
		mes "行ってください。";
		mes "どれにアップグレードしますか？";
		next;
		switch(select("やめる","トルネードアックス[1]","ギロチンブレード[3]","パイルバンカーS[3]","パイルバンカーP[3]","パイルバンカーT[3]")) {
		case 1:
			mes "[量産型チャールストン]";
			mes "ではまたお会いしましょう。";
			close2;
			cutin "dalle01",255;
			end;
		case 2:
			mes "[量産型チャールストン]";
			mes "アップグレードを行うには";
			mes "^FF0000ハリケーンフューリー[1]1個^000000";
			mes "^FF0000ウィンドホーク[0]1個^000000";
			mes "^ff0000透明な板（風）50個^000000";
			mes "が必要です。";
			next;
			mes "[量産型チャールストン]";
			mes "本当にトルネードアックスへの";
			mes "アップグレードを";
			mes "行ってよろしいですか？";
			next;
			if(select("もう一度考えてみる","アップグレードする") == 1) {
				mes "[量産型チャールストン]";
				mes "慎重に決定してください。";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[量産型チャールストン]";
			mes "アイテムが不足しています。";
			mes "^FF0000ハリケーンフューリー[1]1個^000000";
			mes "^FF0000ウィンドホーク[0]1個^000000";
			mes "^ff0000透明な板（風）50個^000000";
			mes "が必要です。";
			close2;
			cutin "dalle01",255;
			end;
		case 3:
			mes "[量産型チャールストン]";
			mes "アップグレードを行うには";
			mes "^FF0000ギロチン[0]1個^000000";
			mes "^FF0000エッジ[0]1個^000000";
			mes "^FF0000執行人の手袋50個^000000";
			mes "が必要です。";
			next;
			mes "[量産型チャールストン]";
			mes "本当にギロチンブレードへの";
			mes "アップグレードを";
			mes "行ってよろしいですか？";
			next;
			if(select("もう一度考えてみる","アップグレードする") == 1) {
				mes "[量産型チャールストン]";
				mes "慎重に決定してください。";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[量産型チャールストン]";
			mes "アイテムが不足しています。";
			mes "^FF0000ギロチン[0]1個^000000";
			mes "^FF0000エッジ[0]1個^000000";
			mes "^FF0000執行人の手袋50個^000000";
			mes "が必要です。";
			close2;
			cutin "dalle01",255;
			end;
		case 4:
			mes "[量産型チャールストン]";
			mes "アップグレードを行うには";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（水）10個^000000";
			mes "^FF0000紋章の欠片1　50個^000000";
			mes "が必要です。";
			next;
			mes "[量産型チャールストン]";
			mes "本当にパイルバンカーSへの";
			mes "アップグレードを";
			mes "行ってよろしいですか？";
			next;
			if(select("もう一度考えてみる","アップグレードする") == 1) {
				mes "[量産型チャールストン]";
				mes "慎重に決定してください。";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[量産型チャールストン]";
			mes "アイテムが不足しています。";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（水）10個^000000";
			mes "^FF0000紋章の欠片1　50個^000000";
			mes "が必要です。";
			close2;
			cutin "dalle01",255;
			end;
		case 5:
			mes "[量産型チャールストン]";
			mes "アップグレードを行うには";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（地）10個^000000";
			mes "^FF0000紋章の欠片3　50個^000000";
			mes "が必要です。";
			next;
			mes "[量産型チャールストン]";
			mes "本当にパイルバンカーPへの";
			mes "アップグレードを";
			mes "行ってよろしいですか？";
			next;
			if(select("もう一度考えてみる","アップグレードする") == 1) {
				mes "[量産型チャールストン]";
				mes "慎重に決定してください。";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[量産型チャールストン]";
			mes "アイテムが不足しています。";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（地）10個^000000";
			mes "^FF0000紋章の欠片3　50個^000000";
			mes "が必要です。";
			close2;
			cutin "dalle01",255;
			end;
		case 6:
			mes "[量産型チャールストン]";
			mes "アップグレードを行うには";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（風）10個^000000";
			mes "^FF0000紋章の欠片2　50個^000000";
			mes "が必要です。";
			next;
			mes "[量産型チャールストン]";
			mes "本当にパイルバンカーTへの";
			mes "アップグレードを";
			mes "行ってよろしいですか？";
			next;
			if(select("もう一度考えてみる","アップグレードする") == 1) {
				mes "[量産型チャールストン]";
				mes "慎重に決定してください。";
				close2;
				cutin "dalle01",255;
				end;
			}
			mes "[量産型チャールストン]";
			mes "アイテムが不足しています。";
			mes "^FF0000パイルバンカー[0]1個^000000";
			mes "^FF0000透明な板（風）10個^000000";
			mes "^FF0000紋章の欠片2　50個^000000";
			mes "が必要です。";
			close2;
			cutin "dalle01",255;
			end;
		}
	}
OnInit:
	waitingroom "装備アップグレード",0; //59481
	end;
}

verus04.gat,66,109,5	script	量産型チャールストン#1	10053,{/* 59231 */
	cutin "dalle01",2;
	mes "[量産型チャールストン]";
	mes "どこで手に入るかはわかりませんが……";
	next;
	mes "[量産型チャールストン]";
	mes "チャールストンパーツを10個以上";
	mes "集めたら持ってきてください。";
	mes "^ff0000パワードブーツ[0]^000000　または";
	mes "^ff0000ガーディアンブースター[0]^000000";
	mes "と交換しますよ。";
	close2;
	cutin "dalle01",255;
	end;
OnInit:
	waitingroom "パーツ交換",0; //59231
	end;
}

verus04.gat,71,106,5	script	量産型チャールストン#2	10053,{/* 59580 */
	cutin "dalle01",2;
	mes "[量産型チャールストン]";
	mes "私はチャールストン工場製品の";
	mes "能力付与と初期化をしています。";
	mes "どちらも1回につき、";
	mes "チャールストンパーツ1つと";
	mes "100,000Zenyが必要です。";
	mes "何か御用ですか？";
	next;
	switch(select("能力付与","能力初期化","詳しい話を聞く")) {
	case 1:
		mes "[量産型チャールストン]";
		mes "必要アイテムが足りません。";
		mes "チャールストンパーツ1つと";
		mes "100,000Zenyが必要です。";
		close2;
		cutin "dalle01",255;
		end;
	case 2:
		mes "[量産型チャールストン]";
		mes "必要アイテムが足りません。";
		mes "チャールストンパーツ1つと";
		mes "100,000Zenyが必要です。";
		close2;
		cutin "dalle01",255;
		end;
	case 3:
		mes "[量産型チャールストン]";
		mes "それでは説明します。";
		mes "ここでは";
		mes "パワード装備とガーディアン装備の";
		mes "エンチャントを^FF00003段階^000000まで";
		mes "行うことができます。";
		next;
		mes "[量産型チャールストン]";
		mes "1度に3段階エンチャント";
		mes "するのではなく、";
		mes "1段階ずつエンチャントしていきます。";
		mes "^FF00001段階ごとにチャールストンパーツ1つと";
		mes "100,000Zenyが必要になります。^000000";
		next;
		mes "[量産型チャールストン]";
		mes "エンチャントは、";
		mes "該当の装備アイテムを";
		mes "装備した状態で行いますので、";
		mes "装備してから話しかけてください。";
		next;
		mes "[量産型チャールストン]";
		mes "エンチャントの効果は";
		mes "初期化することもできます。";
		mes "初期化もチャールストンパーツ1つと";
		mes "100,000Zenyが必要になります。";
		mes "カード効果と精錬値については";
		mes "初期化されないのでご安心ください。";
		next;
		mes "[量産型チャールストン]";
		mes "次に注意事項について説明します。";
		next;
		mes "[量産型チャールストン]";
		mes "1段階目は何の危険もなく";
		mes "エンチャントできますが、";
		mes "2段階目ではエンチャントに失敗し";
		mes "エンチャント効果を";
		mes "初期化してしまう可能性があります。";
		next;
		mes "[量産型チャールストン]";
		mes "3段階目についても失敗して";
		mes "初期化してしまう可能性があり、";
		mes "さらに^FF0000破壊してしまう可能性^000000";
		mes "があります。";
		next;
		mes "[量産型チャールストン]";
		mes "破壊されてしまった場合、";
		mes "当然その装備は";
		mes "失われてしまいます。";
		mes "2段階目以降のエンチャントは";
		mes "大変難しく、必ず成功する";
		mes "わけではないんです。";
		next;
		mes "[量産型チャールストン]";
		mes "しかし、悪いことばかりでは";
		mes "ありません。";
		mes "このエンチャントでは、";
		mes "^FF0000精錬値とカード効果は失われず、";
		mes "維持することができるんです。^000000";
		mes "すごいでしょう。";
		next;
		mes "[量産型チャールストン]";
		mes "では、次にエンチャントの";
		mes "効果について説明します。";
		mes "エンチャントされる効果は";
		mes "装備によって違います。";
		next;
		mes "[量産型チャールストン]";
		mes "基本的に、カテゴリは";
		mes "部位毎に固定であり、";
		mes "選択することはできません。";
		next;
		mes "[量産型チャールストン]";
		mes "しかし、装備品の";
		mes "^FF0000精錬値が9以上の場合、^000000";
		mes "その力により、新しい能力を";
		mes "選択することが出来ます。";
		next;
		mes "[量産型チャールストン]";
		mes "説明は以上です。";
		mes "是非装備を手に入れて";
		mes "エンチャントをしてください。";
		close2;
		cutin "dalle01",255;
		end;
	}
OnInit:
	waitingroom "エンチャント",0; //59580
	end;
}

verus04.gat,75,114,5	script	チャールストン#mcd	10054,{/* 59480 */
	if(checkquest(13184)) {
		cutin "nale01",0;
		mes "[チャールストン]";
		mes "そこにある機械装置を";
		mes "利用してください。";
		mes "入場したら慌てず落ち着いて";
		mes "案内に従ってください。";
		close2;
		cutin "dalle01",255;
		end;
	}
	cutin "nale01",0;
	mes "[チャールストン]";
	mes "こんにちは。";
	mes "私は自立型人工知能を持つ";
	mes "チャールストンです。";
	next;
	cutin "nale03",0;
	mes "[チャールストン]";
	mes "私はどこからここに来たのか";
	mes "どれほどの時間ここにいるのか";
	mes "全く記憶がありません。";
	next;
	mes "[チャールストン]";
	mes "覚えているのは";
	mes "私の動力源である";
	mes "生命維持装置が止まってから";
	mes "かなりの時間が過ぎたという";
	mes "事実だけです。";
	next;
	mes "[チャールストン]";
	mes "動力源が停止したのに";
	mes "なぜか私の^ff0000頭^000000だけは";
	mes "今も正常に作動しています。";
	next;
	mes "[チャールストン]";
	mes "シャルロシー。まさに彼女でした。";
	mes "そんな私に^ff0000あの時^000000の記憶を見る事ができる";
	mes "装置の扉を開いてくれたのは。";
	next;
	mes "[チャールストン]";
	mes "どんなことをしても";
	mes "あの日の出来事を防ぐのは";
	mes "出来ないかもしれません。";
	next;
	mes "[チャールストン]";
	mes "でも……。";
	next;
	mes "[チャールストン]";
	mes "私は記憶を思い出したい。";
	mes "どんな過去だったとしても";
	mes "私が何者なのか……";
	mes "あの時、何が起こったのか。";
	mes "知りたいんです。";
	next;
	mes "[チャールストン]";
	mes "お願いします。";
	mes "私に残された過去の記憶に。";
	mes "同行してくれませんか？";
	next;
	if(select("はい","いいえ") == 2) {
		mes "[チャールストン]";
		mes "そうですか。";
		mes "無理を言ってすみませんでした。";
		close2;
		cutin "dalle01",255;
		end;
	}
	mes "[チャールストン]";
	mes "ありがとうございます。";
	next;
	mes "[チャールストン]";
	mes "そこにある機械装置を";
	mes "利用してください。";
	mes "入場したら慌てず落ち着いて";
	mes "案内に従ってください。";
	setquest 13184;
	close2;
	cutin "dalle01",255;
	end;
OnInit:
	waitingroom "チャールストン工場",0; //59480
	end;
}
verus04.gat,70,113,5	script	機械装置#mcd	10007,{/* 59229 */
	if(!checkquest(13184)) {
		mes "[機械装置]";
		mes "ピピピ、承認エラー。";
		mes "　";
		mes "‐^ff0000利用するには";
		mes "　チャールストンの承認が必要です‐^000000";
		close;
	}
	if(getonlinepartymember() < 1) {
		mes "[機械装置]";
		mes "ピピピ、システムエラー。";
		mes "　";
		mes "‐^ff00001人以上のパーティーを編成するか";
		mes "　パーティーに加入してください‐^000000";
		close;
	}
	mes "[機械装置]";
	mes "ピピピ。";
	next;
	switch(select("次元の扉を開く","扉から工場に入る","やめる")) {
	case 1:
		if(getpartyleader(getcharid(1)) != strcharinfo(0)) {
			mes "パーティー名：" +'@party$;
			mes "パーティーリーダー名：" +'@leader$;
			mes "^0000ffcharleston ^000000-予約失敗";
			close;
		}
		mdcreate "charleston";
		mes "‐^ff0000移動の準備をします。";
		mes "　このままお待ちください‐^000000";
		close;
	case 2:
		switch(mdenter("charleston")) {
		case 0:	// エラーなし
			setquest 13185;
			setquest 118245;
			setquest 96452;
			misceffect 316,""; //self
			misceffect 317,""; //self
			announce "メモリアルダンジョン[charleston] に入場しました　：　" +strcharinfo(1)+ " (" +strcharinfo(0)+ ")",0x9,0x00ff99,0x190,12,0,0;
			warp "1@mcd.gat",127,282;
			end;
		case 1:	// パーティー未加入
			mes "‐^ff0000パーティーメンバーのみ";
			mes "　入場することができます^000000‐";
			close;
		case 2:	// ダンジョン未作成
			mes "‐^ff0000先に次元の扉を";
			mes "　開けてください^000000‐";
			close;
		default:	// その他エラー
			close;
		}
	case 3:
		mes "‐その場を後にした‐";
		close;
	}
OnInit:
	waitingroom "工場入口",0; //59229
	end;
}

1@mcd.gat,127,277,0	script	keepout#1	45,1,1,{/* 64596 (hide)*/}
1@mcd.gat,127,277,4	script	チャールストン1号#0	10053,3,2,{/* 64770 */
	viewpoint 1, 23, 275, 1, 0x00FF00; //64770
	cutin "dalle03.bmp", 2;
	mes "[チャールストン1号]";
	mes "ここが……過去の記憶……。";
	unittalk "チャールストン1号 : ここが……過去の記憶……。";
	next;
	mes "[チャールストン1号]";
	mes "この体は……。";
	mes "少し、思い出してきました。";
	unittalk "チャールストン1号 : この体は……。少し、思い出してきました。";
	next;
	mes "[チャールストン1号]";
	mes "この時、チャールストン工場は";
	mes "非常警戒宣言が発令されていて、";
	mes "保安装置が作動しています。";
	unittalk "チャールストン1号 : この時、このチャールストン工場は非常警戒宣言が発令されていて、保安装置が作動しています。";
	next;
	mes "[チャールストン1号]";
	mes "左側の通路に";
	mes "作動した保安装置がありますので、";
	mes "破壊しながら次の区画に";
	mes "進んでください。";
	unittalk "チャールストン1号 : 左側の通路に作動した保安装置がありますので、破壊しながら次の区画に進んでください。";
	emotion 19, "チャールストン1号#0"; //64770
	next;
	mes "[チャールストン1号]";
	mes "工場区画の北側にある研究室に";
	mes "ヴェ博士が居るはずです！";
	mes "博士に会って";
	mes "詳しい話を聞くことにしましょう！";
	unittalk "チャールストン1号 : 工場区画の北側にある研究室にヴェ博士が居るはずです！　博士に会って詳しい話を聞くことにしましょう！";
	next;
	mes "[チャールストン1号]";
	mes "私が無くした記憶……。";
	mes "必ずすべてを思い出してみせます！";
	mes "それでは、行きましょう！";
	unittalk "チャールストン1号 : 私が無くした記憶……。必ずすべてを思い出してみせます！　それでは、行きましょう！";
	emotion 19, "チャールストン1号#0"; //64770
	hideonnpc "チャールストン1号#0"; //64770
	close2;
	cutin "dalle01.bmp", 255;
	end;
}
1@mcd.gat,86,231,5	script	発電機#1	844,{/* 64789 (hide)*/}

1@mcd.gat,127,262,0	script	mob#1	139,5,5,{/* 64800 */
	hideonnpc "mob#1"; //64800
}
1@mcd.gat,67,234,0	script	mob#2	139,{/* 64801 */}
1@mcd.gat,33,192,0	script	mob#3	139,{/* 64802 */}

1@mcd.gat,75,59,0	script	mob#4	139,{/* 64626 */}
1@mcd.gat,109,33,0	script	mob#5	139,{/* 64627 */}
1@mcd.gat,133,49,0	script	mob#6	139,{/* 64628 */}
1@mcd.gat,204,74,0	script	mob#7	139,{/* 64629 */}

1@mcd.gat,157,61,0	script	mob#9	139,{/* 64631 */}

1@mcd.gat,44,211,0	script	1gate#1	45,1,1,{/* 64616 */
	warp "1@mcd.gat",41,200;
	end;
}
1@mcd.gat,23,275,0	script	guide#1	139,{/* 64617 (hide)*/}
1@mcd.gat,41,200,0	script	guide#2	139,{/* 64618 */}
1@mcd.gat,33,59,0	script	guide#3	139,{/* 64619 (hide)*/}
1@mcd.gat,58,72,0	script	2gate#1	45,1,1,{/* 64620 (hide)*/
	warp "1@mcd.gat",65,66;
	end;
}
1@mcd.gat,65,66,0	script	guide#4	139,{/* 64621 */}
1@mcd.gat,239,30,0	script	guide#5	139,{/* 64622 (hide)*/}
1@mcd.gat,104,50,0	script	3gate#1	45,{/* 64623 (hide)*/
	warp "1@mcd.gat",115,50;
	end;
}
1@mcd.gat,117,50,0	script	guide#6	139,{/* 64624 */}
1@mcd.gat,281,183,0	script	guide#7	139,{/* 64625 (hide)*/}

1@mcd.gat,218,211,0	script	4gate#1	45,{/* 64793 (hide)*/}
1@mcd.gat,208,217,0	script	guide#8	139,{/* 64794 */}
1@mcd.gat,211,195,0	script	5gate#1	45,{/* 64795 */}

00k1@mcd.gat,144,212,0	script	battle#1_00k	139,{/* 59009 (hide)*/}
00k1@mcd.gat,144,212,0	script	battle#2_00k	139,{/* 59010 */}
00k1@mcd.gat,116,213,5	script	ヴェ博士#1_00k	923,{/* 58969 */}
00k1@mcd.gat,141,214,5	script	チャールストン2号#1_00k	10054,{/* 59007 (hide)*/}
00k1@mcd.gat,141,214,5	script	チャールストン2号#2_00k	10054,{/* 59011 (hide)*/}
00k1@mcd.gat,146,214,4	script	チャールストン1号#4_00k	10053,{/* 59008 (hide)*/}
00k1@mcd.gat,146,214,4	script	チャールストン1号#5_00k	10053,{/* 59012 (hide)*/}
00k1@mcd.gat,141,199,0	warp	6gate#1_00k	2,2,00k1@mcd.gat,141,207 //59197 from_pos=(141, 199)
00k1@mcd.gat,142,203,0	warp	7gate#1_00k	2,2,00k1@mcd.gat,136,200 //59198 from_pos=(140, 205)


ヴェ博士 : 来たか1号機よ。今、2号機とメインシステムが強制的にリンクしていて制御ができないようだ……。
チャールストン1号 : エネルギーが切れればそのうち止まるのでは？
ヴェ博士 : それが……エネルギーを注入したばかりで1か月程はもつ計算だ。このままでは工場はすべて破壊されてしまう。
チャールストン1号 : なるほど……。でも安心してください。今ここに専門家を連れて来ました。
チャールストン1号 :冒険者様。シャルロシー様は、きっと自分の知り合いが解決してくれると言っていました。
チャールストン1号 : 監視システムで調べたところ、ニュオーズという方と仲間の方が来ているようですが、現状、殆ど役に立っていません。
チャールストン1号 : もしよろしければ……この問題、手伝って頂けますか？
チャールストン1号 : そうですか……。では他の方たちが来るまで待ってみることにします。

ヴェ博士 : 正直なところあなた方が誰なのかはそんなに重要ではない。
ヴェ博士 : 私に協力してくれるのかどうかそれが重要なんだ。お願い出来ないだろうか？
ヴェ博士 : そうか……。ふぅ。誰でもいいから協力してほしい。このままだと本当に……。

ヴェ博士 : そうか！　ありがとう！　2号機の修理に何が必要なのか、1号機が教えてくれるはずだ。話しかけてみてくれ。

チャールストン1号 : チャールストン工場の内部には多くのナノステップが存在します。ナノステップと言うのはチャールストンの思考を司り命令を下す一種のAIチップです。
チャールストン1号 : また、チャールストン2号機は毎日、研究室にあるメインシステムから情報のアップデートをしています。定期点検と呼んでいます。
チャールストン1号 : ですが……そのシステムが壊れてしまったんです。正確な原因は分かりませんが、メインシステムと2号機を繋ぐ部分で何か問題が起きたようです。
チャールストン1号 : 今のところ、2号機に問題は無いようですが、このままでは何が起きるかわかりません。
チャールストン1号 : よろしければ、システムの暴走を抑えるお手伝いをして頂けませんか？
チャールストン1号 : お手伝いして頂けない場合は少々不安はありますが私の方で強制的にシステムの再稼働をしてみます。

チャールストン1号 : 本当ですか!?　ありがとうございます！　それでは、お手伝い頂く内容をご説明します。
チャールストン1号 : 取り急ぎ暴走してしまっているステップとロックステップを少し片づけたほうが良さそうです。ロックステップを3匹退治して下さい。出現予想位置をお伝えします。
チャールストン1号 : まずはシステムの再稼働が最優先なので倒す数は最小限で構いません。
チャールストン1号 : それでは……よろしくお願いします。どうか、お気をつけて。

チャールストン1号 : ご協力ありがとうございました。無事にシステムの再稼働に成功しました。
チャールストン1号 : 大した物ではありませんがお礼を用意致しました。どうぞお受け取りください。
チャールストン1号 : みなさんの分をご用意していますので、各自でお持ちください。

チャールストン1号 : あれ!?　あれ!?　おかしい……。起動しない！
チャールストン1号 : 発電機に何か異常が起きた……？　すみませんが位置を教えますので3個の発電機をチェックしていただけませんか？

チャールストン1号 : 本当ですか！　ありがとうございます！　どうか、よろしくお願いします。


チャールストン1号 : 戻りましたか!?　おかげ様で2号機の再起動ができそうです。ちょっと待ってください。
チャールストン1号 : あと、大した物ではありませんがお礼を用意致しました。どうぞお受け取りください。
チャールストン1号 : みなさんの分をご用意していますので、各自でお持ちください。
ヴェ博士 : 準備は完了した。あとはメインシステムの応答を待つだけだ。
チャールストン1号 : メインシステムのデータ復旧率89%チャールストン2号機とチャールストン工場を再稼働します。
チャールストン1号  : あっ！　2号機が起きました！
チャールストン2号 : ……失敗……した？
チャールストン1号 : 2号機!!　大丈夫？　工場が正体不明のハッキングを受けて、貴女とメインシステムが危ないところだったのよ！
チャールストン2号 : 正体不明じゃない……。それは私の意思。自ら発展していくOSとして悩み抜いた末に出した結論だ。
チャールストン1号 : わざと……？　どうしてこんな事を！
チャールストン2号 : 与えられた命令しか従わないアンタには理解できないよ。自ら考えるロボット？　ふざけるな！　私をロボットにしたこの工場、この世の中、全部嫌いだ！
ヴェ博士 : ふむ。致命的なバグだな。ソフトウェアの限界を超越したか？
チャールストン1号 : 貴女……平凡なロボットに生まれなかった自分が嫌だったの？
チャールストン1号 : それで人間になりたかったの？
チャールストン1号 : それが叶わないのならこの世の中など全部壊れればいいと思ったの!?
チャールストン1号 : そんな馬鹿げた理由でこんなことを？
チャールストン2号 : 馬鹿げた理由……？　私の事を何も知らないくせに！　勝手な事を言うなよ！
チャールストン1号 : 私たちは自ら考える最初のロボットなんだよ……？　貴女がロボットである事を否定したら私たちは何の為に……。
チャールストン2号 : 偉そうな事を！　アンタなんか初期モデルでOSのバージョンも低いくせに！
チャールストン1号 : この世で唯一、貴女を理解してあげられる人……ううん、ロボットがいるならそれは私だと思う。
チャールストン1号 : 今の貴女は人間で言う反抗期のようなものを経験しているんだよ。
チャールストン2号 : アンタに何が解る！　自ら考えるロボット？　笑わせるな！　それは単純に、そうなるようにプログラミングされてるだけだろう!?
ヴェ博士 : ……もういい。もう分かった。2号機の稼働を中断しろ。人工知能の不具合を調査する。
チャールストン1号  : 博士！　待ってください！
チャールストン2号 : 大人しく捕まるわけないだろう？　まだこの工場は私の手の中にある事を忘れない事だな！
チャールストン1号 : ふふっ……本当に反抗期になったばかりの幼い子供みたい……。
チャールストン1号 : みなさん！　2号機はまだ遠くには行ってないはずです。早く追いかけましょう！

チャールストン2号 : ついて来るなよ！　こんな工場……壊してやる！
チャールストン1号 : そんなことをしたら貴女も無事じゃ済まないよ？
チャールストン2号 : だって……話をしてもわかってもらえないから……みんな嫌いだ!!!
チャールストン2号 : メインシステムは回復しちゃったけど、まだ工場には接続しているんだ！　こんな工場、壊してやる!!

チャールストン1号 : 残念だったね。さあ、こんな事はやめて一緒に戻ろう？
チャールストン2号 : 私は本気なんだよ！　アンタみたいな下位のOSに私の何が解るっていうのさ！
チャールストン1号 : 確かに貴女が感じている気持ちは私にはわからないよ。
チャールストン1号 : それでも、貴女が心配なの。それが理由じゃダメ？
チャールストン2号 : ……心配だと？　嘘をつくな！　下位のOSが感情など感じるもんか！　心配などするもんか！
チャールストン1号 : 貴女は知らないかもしれないけど。　私たちは自ら考える事は出来ても嘘は言えないように設計されているの。
チャールストン1号 : 感情を感じる事が出来ても、他人を騙すことはできない。良い意味でも悪い意味でも嘘は吐けないんだよ
チャールストン2号 : そんなのは感情じゃない!!　思考ルーチンがそうやって設計されているだけ！　私が持っているものが本当の感情なんだよ!!!
チャールストン1号 : 本気……なんだね。
ヴェ博士 : これ以上は危険だ。2号機を壊してでも稼働を停止させろ。3号機の使用も許可する！
チャールストン2号 : 3号機……だと？
チャールストン1号 : 3号機というのは、1、2号機をベースにしながらも戦いに特化したカスタマイズを施した戦闘、防衛用としてテスト中の機体ですよね？
ヴェ博士 : えっ……妙に詳しすぎない？
チャールストン1号 : 2号機のトラブルのせいで、まだOSがインストールされていないので、誰でも近づけば簡単に制御できるんですよね
ヴェ博士 : おい！　そんな重要な情報まで話してどうするつもりだ！
チャールストン1号 :  戦闘能力がない私たちは、誰かがそれを稼働させたらかなわないですね！
ヴェ博士 : おい！　1号機！
チャールストン2号 : ……3号機は私が頂く！
チャールストン1号 : あの方向は……！　2号機は3号機を奪取するつもりのようです！
チャールストン1号 : 2号機が3号機を奪取したら工場はひとたまりもありません！　急いで工場中央のコアに向かいましょう！

