hugel.gat,214,225,3	script	カエクス#togari1	86,{/* 58969 */
	if(Job != Job_Hunter && Job != Job_Ranger) {
		// 未調査
		mes "[カエクス]";
		close;
	}
	switch(TOGARI_QUE) {
	case 0:
	case 1:
		emotion 3;
		mes "[カエクス]";
		mes "レンジャーかあ。";
		mes "ウォーグの背中に乗って";
		mes "走れたら気持ちよさそう。";
		mes "とりあえず、ハンターに";
		mes "ならないとなあ……。";
		next;
		mes "[カエクス]";
		mes "……。";
		mes "僕はいつになったら";
		mes "ハンターになれるんだろう……。";
		mes "試験すら受けられないなんて……。";
		next;
		menu "どうしたんですか？",-;
		mes "[カエクス]";
		mes "え、話を聞いてくれるのかい？";
		mes "あ、僕の名前はカエクス。";
		mes "実は、ハンター転職試験を受けに";
		mes "ここまで案内してもらって";
		mes "来たんだけれど……。";
		mes "追い返されてしまったんだ。";
		next;
		emotion 54;
		mes "[カエクス]";
		mes "はぁ……";
		mes "どうして転職試験に";
		mes "動物たちを連れていっては";
		mes "いけないのだろう……。";
		next;
		menu "転職試験に動物を？",-;
		mes "[カエクス]";
		mes "うん……？";
		mes "何かおかしいこと言ったかな？";
		mes "でも、動物たちがいないと";
		mes "僕の場合、試験を受けるにあたり";
		mes "支障が出てしまうんだ。";
		next;
		mes "[カエクス]";
		mes "ふふ。";
		mes "困惑してるようだね。";
		mes "実は僕、^FF0000目が見えない^000000んだよ。";
		mes "だから君の顔も、";
		mes "実際にはわかっていない。";
		emotion 0,"";
		next;
		mes "[カエクス]";
		mes "はは、驚いた？";
		mes "種明かしするとね。";
		mes "動物たちが教えてくれるから、";
		mes "目が見えなくても、";
		mes "こうして何事もないように";
		mes "会話ができているんだ。";
		next;
		mes "[カエクス]";
		mes "君がどういう格好で";
		mes "どういう表情でいるのか……";
		mes "動物と心を通わせることで";
		mes "僕は知ることができる。";
		mes "今だと近くにいる動物たちに";
		mes "教えてもらってるんだよ。";
		next;
		mes "^0000FF‐カエクスの横にいる";
		mes "　シーオッターがそれを聞いて";
		mes "　答えるように手？をバタバタした‐^000000";
		next;
		mes "[カエクス]";
		mes "でも……";
		mes "ハンター試験会場に";
		mes "動物を連れていくのは";
		mes "厳禁だと言われてしまい……";
		mes "なんとか説得できないか";
		mes "考えていたんだ。";
		next;
		mes "[カエクス]";
		mes "え？　なんだい？";
		mes "あ、ごめんね。";
		mes "シーオッターが何かいってて……。";
		mes "ふむふむ？　なるほど。";
		next;
		mes "[カエクス]";
		mes "君は頼りになりそうだと";
		mes "シーオッターから";
		mes "教えてもらったよ。";
		mes "それに……";
		next;
		mes "[カエクス]";
		mes "君の雰囲気はなんだか";
		mes "ある人を思い出させて";
		mes "君なら僕の願いを聞いてくれる";
		mes "気がしてしょうがない。";
		mes "だから不躾なお願いと承知で";
		mes "言わせてほしい。";
		next;
		mes "[カエクス]";
		mes "ハンター試験を突破した君から";
		mes "何とか動物たちと一緒に試験を";
		mes "受けられるように";
		mes "職員の方に";
		mes "お願いしてほしいんだ。";
		next;
		mes "[カエクス]";
		mes "僕からはもう何度も";
		mes "話したんだけれど、";
		mes "聞き入れてもらえなくてね……。";
		next;
		mes "[カエクス]";
		mes "お願いだよ！";
		mes "ハンターギルドの建物に入って、";
		mes "すぐ左手にいる女性に、";
		mes "僕が試験を受けられるよう";
		mes "頼んでほしい！";
		next;
		mes "[カエクス]";
		mes "このままじゃ僕……";
		mes "この場所に許可が下りるまで";
		mes "居なくてはならなくなりそう……。";
		mes "僕だけならまだしも、";
		mes "動物たちもここから離れられなくなると";
		mes "かわいそうだし……。";
		next;
		mes "[カエクス]";
		mes "そうなるとギルド側も";
		mes "いろいろ問題がでるんじゃないかな。";
		mes "だから、お願い！";
		mes "僕と動物たちとギルドの人を";
		mes "助けると思って、是非！";
		mes "頼んだからね！";
		next;
		mes "‐強引に依頼をされてしまった。";
		mes "　ハンターギルドの建物に入って";
		mes "　すぐ左手にいるハンターギルド員に";
		mes "　カエクスの頼み事を伝えに行こう‐";
		chgquest 115000,115003;
		set TOGARI_QUE,2;
		close;
	case 2:
		mes "[カエクス]";
		mes "ハンターギルドの建物に入って、";
		mes "すぐ左手にいる女性が";
		mes "担当の人らしい。";
		mes "頼んだよ！";
		next;
		mes "‐強引に依頼をされてしまった。";
		mes "　ハンターギルドの建物に入って";
		mes "　すぐ左手にいるハンターギルド員に";
		mes "　カエクスの頼み事を伝えに行こう‐";
		close;
	case 3:
		mes "[カエクス]";
		mes "お帰り！";
		mes "どうだった？";
		next;
		mes "‐ハンターギルド員と話したが、";
		mes "　頼みは聞き入れられなかったことを";
		mes "　カエクスに伝えた‐";
		next;
		emotion 28, "カエクス#togari1";
		mes "[カエクス]";
		mes "そうなのか……";
		mes "結果は残念だけど";
		mes "僕の頼みを聞いてくれて";
		mes "ありがとう……。";
		next;
		mes "[カエクス]";
		mes "はぁ……";
		mes "やっぱり僕がハンターになるのは";
		mes "無理なのか……？";
		next;
		mes "[カエクス]";
		mes "…………。";
		next;
		emotion 32, "カエクス#togari1";
		mes "[カエクス]";
		mes "いや、あきらめないぞ！";
		mes "僕は絶対、立派なハンターになる！";
		next;
		menu "なぜそんなにハンターになりたいの？",-;
		mes "[カエクス]";
		mes "それは……";
		next;
		mes "[カエクス]";
		mes "君には世話になったし言うよ。";
		mes "僕には姉さんがいるんだ。";
		mes "姉さんは自然を愛するハンターで……";
		mes "僕がハンターになったら、";
		mes "一緒に狩りをしようと";
		mes "約束をしたんだよ。";
		next;
		mes "[カエクス]";
		mes "ちょっと臆病なところのある人でね。";
		mes "それでも誰かのためなら、無理したり";
		mes "頑張るところがあるから";
		mes "約束どおりハンターになって、";
		mes "僕が力になってあげたいんだ。";
		next;
		mes "[カエクス]";
		mes "と言っても、もうずいぶん前に";
		mes "姉さんはどこかに行ってしまって、";
		mes "今はどこにいるのかも";
		mes "わからないんだけどね……。";
		mes "どうしてるかなあ。";
		next;
		mes "[カエクス]";
		mes "そうそう。";
		mes "これ、姉さんに作り方を";
		mes "教えてもらったものなんだ。";
		next;
		mes "‐カエクスは、懐から";
		mes "　奇妙な形をした笛を";
		mes "　取り出した‐";
		next;
		menu "笛？",-;
		mes "[カエクス]";
		mes "うん。";
		mes "でも、普通の笛とは違うんだ。";
		mes "^ff0000鳥狩の呼子(とがりのよびこ)^000000って笛。";
		mes "ハンターの操るファルコンを、";
		mes "より効果的に扱えるようになる";
		mes "特別な笛なんだって。";
		next;
		mes "[カエクス]";
		mes "鳥狩はファルコンを使って";
		mes "鳥を捕まえること。";
		mes "呼子は、呼子笛って聞いたことない？";
		mes "その呼子笛で、";
		mes "ファルコンへ合図を送るんだ！";
		mes "ふふ、すごいでしょ！";
		next;
		mes "[カエクス]";
		mes "まあ、今のは全部姉さんの";
		mes "受け売りだけどね。";
		next;
		mes "[カエクス]";
		mes "ただ……";
		mes "僕はまだ、ハンターじゃないから、";
		mes "これを狩りに使うことは";
		mes "できないんだけど……。";
		next;
		mes "[カエクス]";
		mes "姉さんが、この笛の作り方を";
		mes "僕に教えたということは、";
		mes "僕がハンターになるのを";
		mes "期待してだと思うんだ。";
		mes "一言もそんなこと言ってなかったけど";
		mes "きっとそうに違いない。";
		next;
		mes "[カエクス]";
		mes "だからその期待に応えたい……。";
		mes "それもまた僕が絶対に";
		mes "ハンターになりたい理由の";
		mes "一つなんだよ。";
		next;
		menu "お姉さんはその笛を使っていたの？",-;
		mes "[カエクス]";
		mes "もちろん！";
		mes "そのおかげで、姉さんは";
		mes "他のハンターよりも優れた";
		mes "狩りの成果を上げることが";
		mes "できていたんだよ！";
		next;
		mes "[カエクス]";
		mes "成果……？　そうだ！";
		mes "この笛のことをハンターギルドの";
		mes "担当の人に話したら";
		mes "僕の試験について考え直して";
		mes "くれないかなあ。";
		next;
		mes "[カエクス]";
		mes "この笛がハンターにとって";
		mes "便利になることは";
		mes "僕が姉さんから片時も";
		mes "離れることなく見ていたから";
		mes "自信はあるんだよね！";
		mes "というわけで……";
		next;
		mes "[カエクス]";
		mes "またお願いしてもいいかな？";
		mes "さっきのハンターギルドの女性に";
		mes "この笛のことを伝えて、もう1度、";
		mes "僕が試験を受けられるよう";
		mes "頼んできてほしい。";
		mes "頼れるのは君だけだし！";
		next;
		mes "‐ハンターギルドの建物に入って";
		mes "　すぐ左手にいるハンターギルド員に";
		mes "　^ff0000鳥狩の呼子^000000の事を伝えに行こう‐";
		chgquest 115006,115009;
		set TOGARI_QUE,4;
		close;
	case 4:
		mes "[カエクス]";
		mes "先ほどのハンターギルドの女性に";
		mes "この笛のことを伝えて、もう1度、";
		mes "僕が試験を受けられるよう";
		mes "頼んできてほしい。";
		mes "お願いだよ！";
		next;
		mes "‐ハンターギルドの建物に入って";
		mes "　すぐ左手にいるハンターギルド員に";
		mes "　^ff0000鳥狩の呼子^000000の事を伝えに行こう‐";
		close;
	case 5:
		mes "[カエクス]";
		mes "お帰り！";
		mes "どうだった？";
		next;
		mes "‐ハンターギルド員に話したところ、";
		mes "　まずは^ff0000鳥狩の呼子^000000を持ってくるよう";
		mes "　言われたことを伝えた‐";
		next;
		mes "[カエクス]";
		mes "おお！";
		mes "反応は悪くなかった、";
		mes "みたいだね？";
		next;
		mes "[カエクス]";
		mes "^ff0000鳥狩の呼子^000000の効果を確認する";
		mes "必要があると……。";
		mes "わかったよ！";
		mes "じゃあもう一度いこう。";
		mes "今度は僕もついていくよ。";
		next;
		mes "‐ハンターギルドの建物に入って";
		mes "　すぐ左手にいるハンターギルド員に";
		mes "　^ff0000鳥狩の呼子^000000を渡しに行こう‐";
		chgquest 115012,115015;
		set TOGARI_QUE,6;
		close;
	case 6:
		mes "[カエクス]";
		mes "^ff0000鳥狩の呼子^000000の効果を確認する";
		mes "必要があると……。";
		mes "わかったよ！";
		mes "じゃあもう一度いこう。";
		mes "今度は僕もついていくよ。";
		next;
		mes "‐ハンターギルドの建物に入って";
		mes "　すぐ左手にいるハンターギルド員に";
		mes "　^ff0000鳥狩の呼子^000000を渡しに行こう‐";
		close;
	case 7:
	case 8:
	case 9:
	case 10:
		mes "[カエクス]";
		mes "ハンターギルドのお姉さんが";
		mes "頼みたいことがあるみたいだよ。";
		mes "僕のハンター試験受験の許可が";
		mes "下りるか決まるまで、";
		mes "そのお願いを聞いてもらっても";
		mes "いいかな？";
		next;
		mes "‐ハンターギルドの建物に入って";
		mes "　すぐ左手にいるハンターギルド員の";
		mes "　頼みごとを聞いてみよう‐";
		close;
	case 11:
		mes "[カエクス]";
		mes "あ、待ってたよ！";
		mes "おかげ様で、無事ハンターに";
		mes "なることができたんだ。";
		mes "本当にありがとう！";
		next;
		menu "ハンターギルドから仕事を請け負ったと聞いた",-;
		mes "[カエクス]";
		mes "うんうん。";
		mes "^ff0000鳥狩の呼子^000000以外にも、";
		mes "^ff0000鳥狩の鉤爪、鳥狩の弓懸^000000という";
		mes "アイテムがあってね。";
		next;
		mes "[カエクス]";
		mes "ハンターギルドからの";
		mes "モンスター討伐やアイテム収集の依頼を";
		mes "僕がハンターたちに斡旋して、";
		mes "達成した人に、アイテムをプレゼント";
		mes "っていう、仕事だよ。";
		next;
		mes "[カエクス]";
		mes "興味がもしあったら";
		mes "僕のところに来てみてね！";
		next;
		mes "[カエクス]";
		mes "これは今回僕のために";
		mes "たくさん協力してくれたお礼だよ。";
		mes "受け取って。";
		next;
		chgquest 115027,201675;
		getitem 18985, 1;
		set TOGARI_QUE,12;
		mes "[カエクス]";
		mes "それじゃ、";
		mes "またよかったら";
		mes "会いにきてくれると";
		mes "嬉しいよ。";
		close;
	case 12:
	case 13:
	case 14:
		mes "[カエクス]";
		mes "やあ、こんにちは！";
		mes "会いに来てくれて嬉しいよ。";
		next;
		if(TOGARI_QUE == 13) {
			if(checkquest(96255)) {
				if(checkquest(96255) & 0x4) {
					set '@gain,18985;
					set '@quest,96255;
				}
				else {
					set '@str$,"グリーンイグアナ150体";
					set '@quest,96255;
				}
			}
			else if(checkquest(96260)) {
				if(checkquest(96260) & 0x4) {
					set '@gain,28321;
					set '@quest,96260;
				}
				else {
					set '@str$,"グリフォン3体";
					set '@quest,96260;
				}
			}
			else if(checkquest(96265)) {
				if(checkquest(96265) & 0x4) {
					set '@gain,28322;
					set '@quest,96265;
				}
				else {
					set '@str$,"ミュータントドラゴン10体";
					set '@quest,96265;
				}
			}
			if('@gain) {
				// 未調査
				mes "[カエクス]";
				mes "おっ";
				mes "依頼したモンスターの討伐が";
				mes "終わったみたいだね。";
				next;
				mes "[カエクス]";
				mes "おつかれさま。";
				mes "これが報酬の";
				mes getitemname('@gain)+ "だよ。";
				delquest '@quest;
				set TOGARI_QUE,12;
				getitem '@gain,1;
				close;
			}
			mes "[カエクス]";
			mes "あれ？";
			mes "依頼したモンスターの討伐がまだ";
			mes "終わっていないみたいだね。";
			next;
			mes "[カエクス]";
			mes "討伐目標は、";
			mes "^0000ff" +'@str$+ "^000000だよ。";
			next;
			mes "[カエクス]";
			mes "それとも、この依頼、";
			mes "あきらめる？";
			next;
			if(select("このまま討伐を続ける","依頼をあきらめる") == 1) {
				mes "[カエクス]";
				mes "それじゃ、よろしくね。";
				close;
			}
			mes "[カエクス]";
			mes "この依頼をあきらめると、";
			mes "^ff0000今まで討伐で倒した数が";
			mes "無駄になる^000000けど、";
			mes "それでもいいのかな？";
			next;
			if(select("このまま討伐を続ける","依頼をあきらめる") == 1) {
				mes "[カエクス]";
				mes "それじゃ、よろしくね。";
				close;
			}
			mes "[カエクス]";
			mes "わかったよ！";
			mes "それじゃ、また依頼を";
			mes "受けたくなったら";
			mes "来てね！";
			close2;
			delquest '@quest;
			set TOGARI_QUE,12;
			end;
		}
		else if(TOGARI_QUE == 14) {
			if(checkquest(115030)) {
				setarray '@need,724,7023,7002,7022,714;
				setarray '@amount,5,10,100,1,1;
				set '@gain,18985;
				set '@quest,115030;
			}
			else if(checkquest(115033)) {
				setarray '@need,724,7023,7002,7022,714;
				setarray '@amount,5,10,100,1,1;
				set '@gain,28321;
				set '@quest,115033;
			}
			else if(checkquest(115036)) {
				setarray '@need,6403,7200;
				setarray '@amount,100,10;
				set '@gain,28322;
				set '@quest,115036;
			}
			for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
				if(countitem('@need['@i]) < '@amount['@i]) {
					mes "[カエクス]";
					mes "あれ？";
					mes "依頼したアイテムがまだ";
					mes "集まっていないみたいだね？";
					next;
					mes "[カエクス]";
					mes "デワタドラゴンの皮100個";
					mes "弾力がある縄10個";
					mes "だよ。";
					next;
					mes "[カエクス]";
					mes "それとも、この依頼、";
					mes "あきらめるかい？";
					next;
					if(select("このままアイテム収集を続ける","依頼をあきらめる") == 1) {
						mes "[カエクス]";
						mes "それじゃ、よろしくね。";
						close;
					}
					mes "[カエクス]";
					mes "わかったよ！";
					mes "それじゃ、また依頼を";
					mes "受けたくなったら";
					mes "来てね！";
					close2;
					delquest '@quest;
					set TOGARI_QUE,12;
					end;
				}
			}
			// 未調査
			mes "[カエクス]";
			mes "おっ";
			mes "依頼したアイテム収集が";
			mes "終わったみたいだね。";
			next;
			mes "[カエクス]";
			mes "おつかれさま。";
			mes "これが報酬の";
			mes getitemname('@gain)+ "だよ。";
			delquest '@quest;
			for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
				delitem '@need['@i],'@amount['@i];
			}
			set TOGARI_QUE,12;
			getitem '@gain,1;
			close;
		}
		mes "[カエクス]";
		mes "さて……";
		mes "ハンターギルドの依頼を";
		mes "受けにきたのかな？";
		mes "どの装備をもらえる";
		mes "依頼にしようか？";
		next;
		switch(select("^ff0000鳥狩の呼子（とがりのよびこ）^000000","^0000ff鳥狩の鉤爪（とがりのかぎづめ）^000000","^4d4dff鳥狩の弓懸（とがりのゆがけ）^000000","依頼を受けない")) {
		case 1:
			mes "[カエクス]";
			mes "鳥狩の呼子は、ハンターのスキル";
			mes "「ブリッツビート」の発動率が";
			mes "上昇する、兜‐下段‐の装備だね。";
			mes "また、他の鳥狩シリーズの装備と";
			mes "共に身につけることで、";
			mes "与えるダメージも増加するよ。";
			next;
			mes "[カエクス]";
			mes "モンスター討伐とアイテム収集、";
			mes "どちらの依頼を受ける？";
			next;
			switch(select("^ff0000モンスター討伐の依頼を受ける^000000","^0000ffアイテム収集の依頼を受ける^000000","依頼を受けない")) {
			case 1:
				mes "[カエクス]";
				mes "^ff0000モンスターの討伐^000000は、";
				mes "^0000ffグリーンイグアナを150体^000000、";
				mes "倒してきてほしいんだ。";
				mes "これでいいかな？";
				next;
				if(select("はい","依頼を受けない") == 2) {
					break;
				}
				mes "[カエクス]";
				mes "それじゃあ、";
				mes "^0000ffグリーンイグアナ150体^000000の";
				mes "討伐、よろしくね。";
				mes "途中でやめたくなった場合は、";
				mes "もう一度僕に話しかけてくれれば";
				mes "いいからね。";
				setquest 96255;
				set TOGARI_QUE,13;
				close;
			case 2:
				mes "[カエクス]";
				mes "^ff0000アイテムの収集^000000だね。";
				mes "次のアイテムを集めてきて";
				mes "もらうよ。";
				next;
				mes "[カエクス]";
				mes "^0000ffアロエの葉30個";
				mes "油紙20個";
				mes "なめらかな紙10個";
				mes "フェイヨン水溶液1個";
				mes "モロク水溶液1個^000000";
				next;
				if(select("はい","依頼を受けない") == 2) {
					break;
				}
				mes "[カエクス]";
				mes "アロエの葉30個";
				mes "油紙20個";
				mes "なめらかな紙10個";
				mes "フェイヨン水溶液1個";
				mes "モロク水溶液1個だよ。";
				mes "よろしくね。";
				next;
				mes "[カエクス]";
				mes "途中でやめたくなった場合は、";
				mes "もう一度僕に話しかけてね。";
				setquest 115030;
				set TOGARI_QUE,14;
				close;
			case 3:
				break;
			}
			break;
		case 2:
			mes "[カエクス]";
			mes "鳥狩の鉤爪は、ハンターのスキル";
			mes "「ブリッツビート」の威力を";
			mes "増加させる、BaseLv80から";
			mes "装備できるアクセサリーだね。";
			next;
			mes "[カエクス]";
			mes "モンスター討伐とアイテム収集、";
			mes "どちらの依頼を受ける？";
			next;
			switch(select("^ff0000モンスター討伐の依頼を受ける^000000","^0000ffアイテム収集の依頼を受ける^000000","依頼を受けない")) {
			case 1:
				mes "[カエクス]";
				mes "^ff0000モンスターの討伐^000000は、";
				mes "^0000ffグリフォンを3体^000000、";
				mes "倒してきてほしいんだ。";
				mes "これでいいかな？";
				next;
				if(select("はい","依頼を受けない") == 2) {
					break;
				}
				mes "[カエクス]";
				mes "それじゃあ、";
				mes "^0000ffグリフォン3体^000000の";
				mes "討伐、よろしくね。";
				mes "途中でやめたくなった場合は、";
				mes "もう一度僕に話しかけてくれれば";
				mes "いいからね。";
				setquest 96260;
				set TOGARI_QUE,13;
				close;
			case 2:
				mes "[カエクス]";
				mes "^ff0000アイテムの収集^000000だね。";
				mes "次のアイテムを集めてきて";
				mes "もらうよ。";
				next;
				mes "[カエクス]";
				mes "^0000ffドラゴンの鱗100個";
				mes "グリフォンの爪8個";
				mes "";
				mes "";
				mes "^000000";
				next;
				mes "[カエクス]";
				mes "これでいいかな？";
				next;
				if(select("はい","依頼を受けない") == 2) {
					break;
				}
				mes "[カエクス]";
				mes "ドラゴンの鱗100個";
				mes "グリフォンの爪8個";
				mes "";
				mes "";
				mes "だよ。";
				mes "よろしくね。";
				next;
				mes "[カエクス]";
				mes "途中でやめたくなった場合は、";
				mes "もう一度僕に話しかけてね。";
				setquest 115033;
				set TOGARI_QUE,14;
				close;
			case 3:
				break;
			}
			break;
		case 3:
			mes "[カエクス]";
			mes "鳥狩の弓懸は、スキル使用時の";
			mes "消費SPを減少させる、";
			mes "スナイパーのBaseLv85から";
			mes "装備できるアクセサリーだよ。";
			next;
			mes "[カエクス]";
			mes "モンスター討伐とアイテム収集、";
			mes "どちらの依頼を受ける？";
			next;
			switch(select("^ff0000モンスター討伐の依頼を受ける^000000","^0000ffアイテム収集の依頼を受ける^000000","依頼を受けない")) {
			case 1:
				mes "[カエクス]";
				mes "^ff0000モンスターの討伐^000000は、";
				mes "^0000ffミュータントドラゴンを10体^000000、";
				mes "倒してきてほしいんだ。";
				mes "これでいいかな？";
				next;
				if(select("はい","依頼を受けない") == 2) {
					break;
				}
				mes "[カエクス]";
				mes "それじゃあ、";
				mes "^0000ffミュータントドラゴン10体^000000の";
				mes "討伐、よろしくね。";
				mes "途中でやめたくなった場合は、";
				mes "もう一度僕に話しかけてくれれば";
				mes "いいからね。";
				setquest 96265;
				set TOGARI_QUE,13;
				close;
			case 2:
				mes "[カエクス]";
				mes "^ff0000アイテムの収集^000000だね。";
				mes "次のアイテムを集めてきて";
				mes "もらうよ。";
				next;
				mes "[カエクス]";
				mes "^0000ffデワタドラゴンの皮100個";
				mes "弾力がある縄10個";
				mes "";
				mes "";
				mes "^000000";
				next;
				mes "[カエクス]";
				mes "これでいいかな？";
				next;
				if(select("はい","依頼を受けない") == 2) {
					break;
				}
				mes "[カエクス]";
				mes "デワタドラゴンの皮100個";
				mes "弾力がある縄10個";
				mes "";
				mes "";
				mes "だよ。";
				mes "よろしくね。";
				next;
				mes "[カエクス]";
				mes "途中でやめたくなった場合は、";
				mes "もう一度僕に話しかけてね。";
				setquest 115036;
				set TOGARI_QUE,14;
				close;
			case 3:
				break;
			}
		case 4:
			break;
		}
		mes "[カエクス]";
		mes "うん、そうか。";
		mes "それじゃ、依頼を受けたくなったら";
		mes "また来てね。";
		close;
	}
OnTouch:
	if(TOGARI_QUE == 0) {
		// 未調査
		mes "[カエクス]";
		mes "あぁー、困ったなぁ";
		setquest 115000;
		TOGARI_QUE,1;
		close;
	}
	end;
OnInit:
	waitingroom "笛吹きハンター！",0;
	end;
}

hu_in01.gat,376,373,4	script	ハンターギルド員#togari	66,{/* 58970 */
	switch(TOGARI_QUE) {
	case 2:
		emotion 1;
		mes "[ハンターギルド員]";
		mes "ん？　私に何か用か？";
		next;
		mes "‐カエクスから頼まれた話を";
		mes "　ハンターギルド員に伝えた‐";
		next;
		mes "[ハンターギルド員]";
		mes "ああ、彼に頼まれたのか。";
		mes "しかしなぁ……。";
		next;
		mes "[ハンターギルド員]";
		mes "いや、目が見えないことが";
		mes "問題ではないのだ。";
		mes "動物を連れて試験に挑むことが";
		mes "問題なんだよ。";
		next;
		mes "[ハンターギルド員]";
		mes "ここは、アーチャーとして";
		mes "磨いた腕を確認して、";
		mes "ハンターとしての資格があるか";
		mes "見極める場所だ。";
		next;
		mes "[ハンターギルド員]";
		mes "アーチャーの能力とは異なる、";
		mes "動物と心を通わせるという才能で";
		mes "試験を突破されても、";
		mes "それをよしとするわけには";
		mes "いかないんだよ。";
		next;
		mes "[ハンターギルド員]";
		mes "彼……カエクスと言ったかな？";
		mes "カエクスにも、もう何度も";
		mes "説明したのだが……。";
		next;
		mes "[ハンターギルド員]";
		mes "まあ、そういうわけだから。";
		mes "試験の受注にOKを出すことは";
		mes "できないんだよね。";
		next;
		mes "[ハンターギルド員]";
		mes "しかし、なんだろうね。";
		mes "動物と心を通わせるなんて";
		mes "すごい能力があるのだから、";
		mes "ハンターにこだわらなくても";
		mes "もっとすごいことができそうなのに。";
		next;
		mes "[ハンターギルド員]";
		mes "なぜハンターでなくてはならないのか";
		mes "興味はあるが、まあ、これはあくまで";
		mes "個人的な興味だ。";
		mes "それで試験を受ける資格をどうこうする";
		mes "つもりはない。";
		next;
		mes "[ハンターギルド員]";
		mes "カエクスには、";
		mes "残念だけど……";
		mes "と、伝えてくれ。";
		mes "君も、彼のために";
		mes "わざわざ足を運んでもらったのに";
		mes "すまないなあ。";
		next;
		mes "‐ハンターギルド員の言うとおり";
		mes "　なぜハンターにこだわるのかは、";
		mes "　気になるところだ。";
		mes "　カエクスのところに戻り、";
		mes "　頼みは聞き入れられなかったことを";
		mes "　伝えよう‐";
		chgquest 115003,115006;
		TOGARI_QUE,3;
		close;
	case 3:
		mes "[ハンターギルド員]";
		mes "カエクスには、";
		mes "残念だけど……";
		mes "と、伝えてくれ。";
		mes "すまないね。";
		mes "わざわざ来てくれたのに……。";
		next;
		mes "‐カエクスのところに戻り、";
		mes "　頼みは聞き入れられなかったことを";
		mes "　伝えよう‐";
		close;
	case 4:
		mes "[ハンターギルド員]";
		mes "何だ、また来たのか？";
		next;
		mes "‐鳥狩の呼子の話を";
		mes "　ハンターギルド員に伝えた‐";
		next;
		mes "[ハンターギルド員]";
		mes "ほう、^ff0000鳥狩の呼子^000000、ねぇ……。";
		mes "本当にそんなアイテムがあるのなら";
		mes "すごい話だ。";
		next;
		mes "[ハンターギルド員]";
		mes "ハンターギルドとしても";
		mes "ファルコンの利用が高まれば";
		mes "願ったり叶ったりだ。";
		mes "ファルコンの利用率が以前に比べて";
		mes "芳しくない状態だったからね。";
		next;
		mes "[ハンターギルド員]";
		mes "しかし、カエクスはまだ";
		mes "ハンターではないのだろう？";
		mes "なぜ彼に、その笛が効果的で";
		mes "あることがわかるんだ？";
		next;
		mes "‐カエクスの姉がハンターであり、";
		mes "　笛の効果や作り方は、その姉から";
		mes "　教わったらしいことを伝えた‐";
		next;
		mes "[ハンターギルド員]";
		mes "ほう、ハンターの姉がいるのか。";
		next;
		mes "‐ついでに、ハンターギルド員も";
		mes "　気にしていた、なぜカエクスが";
		mes "　ハンターにこだわるのか、";
		mes "　カエクスから聞いた話を伝える‐";
		next;
		mes "[ハンターギルド員]";
		mes "ほう……";
		mes "なるほど……";
		mes "そんな理由が……。";
		next;
		mes "‐心なしか、ハンターギルド員の";
		mes "　目が潤んでいるような気がする‐";
		next;
		menu "涙？",-;
		emotion 19, "ハンターギルド員#togari";
		mes "[ハンターギルド員]";
		mes "いや！　いやいや!!";
		mes "泣いてなどいない!!";
		next;
		mes "[ハンターギルド員]";
		mes "ただちょっと、";
		mes "自分の弟のことを";
		mes "思い出して、うるうると……。";
		next;
		menu "泣いているじゃないですか",-,"……。",-;
		mes "[ハンターギルド員]";
		mes "私にも弟がいてな。";
		mes "昔は、お姉ちゃんみたいになる！";
		mes "って言って、よく後ろを";
		mes "ついて来たものだが、";
		mes "最近では……。";
		next;
		mes "[ハンターギルド員]";
		mes "アンタは男みたいだ、だの、";
		mes "アンタと一緒にいるのは";
		mes "恥ずかしい、だの……。";
		mes "そもそも、姉に向かって、";
		mes "「アンタ」はないだろ!?";
		mes "ああ……天使のような子が……。";
		next;
		emotion 28, "ハンターギルド員#togari";
		mes "[ハンターギルド員]";
		mes "それに比べてカエクスは";
		mes "いい弟だなぁ……。";
		next;
		mes "[ハンターギルド員]";
		mes "……";
		next;
		mes "[ハンターギルド員]";
		mes "……";
		mes "……ゴホン！";
		next;
		mes "[ハンターギルド員]";
		mes "あー、しかし、だ！";
		mes "カエクスにかわいい弟像を";
		mes "見たからといって、試験を";
		mes "受けさせるわけにはいかない。";
		next;
		mes "[ハンターギルド員]";
		mes "だが、^ff0000鳥狩の呼子^000000とやらが、";
		mes "本当にカエクスの言うような";
		mes "特別な効果があるなら、";
		mes "ギルドにとっても、大きな";
		mes "プラスとなる。";
		next;
		mes "[ハンターギルド員]";
		mes "まずはその^ff0000鳥狩の呼子^000000を";
		mes "実際に見せてくれないか？";
		mes "ギルドで検証してみないことには";
		mes "なんの結論も出すことはできない。";
		next;
		mes "‐ハンターギルド員から";
		mes "　^ff0000鳥狩の呼子^000000を持ってくるよう";
		mes "　頼まれた。";
		mes "　カエクスのところに戻ろう‐";
		chgquest 115009,115012;
		TOGARI_QUE,5;
		close;
	case 5:
		mes "[ハンターギルド員]";
		mes "まずはその^ff0000鳥狩の呼子^000000を";
		mes "実際に見せてくれないか？";
		mes "ギルドで検証してみないことには";
		mes "なんの結論も出すことはできない。";
		next;
		mes "‐ハンターギルド員から";
		mes "　^ff0000鳥狩の呼子^000000を持ってくるよう";
		mes "　頼まれた。";
		mes "　カエクスのところに戻ろう‐";
		close;
	case 6:
		mes "[ハンターギルド員]";
		mes "おう、来たか。";
		mes "おや……？";
		next;
		mes "[カエクス]";
		mes "こんにちは。";
		mes "鳥狩の呼子を持ってきました。";
		next;
		mes "[ハンターギルド員]";
		mes "あ、ああ、カエクスか。";
		mes "この間は……そのー、なんだ。";
		mes "よく話も聞かず、追い返して";
		mes "すまなかったな。";
		mes "許してくれ。";
		next;
		mes "[カエクス]";
		mes "いえ、そんな……";
		mes "お姉さんはギルドのルールを";
		mes "順守しただけですし。";
		next;
		mes "[ハンターギルド員]";
		mes "君はいい子だな……。";
		mes "そんな君に、一つお願いがある。";
		next;
		mes "[カエクス]";
		mes "何でしょう？";
		next;
		mes "[ハンターギルド員]";
		mes "1度でいいから、私を";
		mes "「お姉ちゃん」と呼んでみて";
		mes "くれないか？";
		next;
		mes "[カエクス]";
		mes "え？";
		next;
		mes "[ハンターギルド員]";
		mes "頼む！";
		mes "この通りっ！";
		next;
		mes "[カエクス]";
		mes "……";
		next;
		mes "[ハンターギルド員]";
		mes "……";
		next;
		mes "[カエクス]";
		mes "……";
		mes "お姉ちゃん？";
		next;
		mes "[ハンターギルド員]";
		mes "ぶふぉっ！";
		next;
		mes "[ハンターギルド員]";
		mes "す、すまない……！";
		mes "想像以上に効果が抜群でな……";
		mes "お姉ちゃん……";
		mes "な、なんと素晴らしい";
		mes "響きだろうか……。";
		next;
		mes "[ハンターギルド員]";
		mes "変なお願いをしてしまって";
		mes "すまなかった。";
		mes "そして、ありがとう。";
		next;
		mes "[カエクス]";
		mes "はぁ……。";
		next;
		mes "[ハンターギルド員]";
		mes "ではカエクス、";
		mes "^ff0000鳥狩の呼子^000000をお姉ちゃ……";
		mes "ゴホン。";
		mes "私に見せてくれるかな？";
		next;
		mes "[カエクス]";
		mes "はい、これです。";
		next;
		mes "‐カエクスはハンターギルド員に";
		mes "　^ff0000鳥狩の呼子^000000を手渡した‐";
		next;
		mes "[ハンターギルド員]";
		mes "ほう、これが……";
		mes "不思議な形をしてはいるが、";
		mes "特殊な力を持っているようには";
		mes "見えないな……。";
		next;
		mes "[ハンターギルド員]";
		mes "カエクス、君はこれの";
		mes "使い方を知っているのか？";
		next;
		mes "[カエクス]";
		mes "はい、姉に使用法は教わっています。";
		next;
		mes "[ハンターギルド員]";
		mes "なるほど。";
		mes "それを教えてもらってもいいか？";
		mes "レポートにしてその笛とともに";
		mes "上層部に渡し、君のハンター試験に";
		mes "ついての判断を仰ぐことにしよう。";
		next;
		mes "[カエクス]";
		mes "はい！";
		mes "ありがとうございます！";
		next;
		mes "[ハンターギルド員]";
		mes "うむ。";
		mes "そして" +strcharinfo(0)+ "、";
		mes "君だが……";
		next;
		mes "‐ハンターギルド員がこちらに";
		mes "　話題を向ける‐";
		next;
		mes "[ハンターギルド員]";
		mes "結果が出るまで多少";
		mes "時間がかかりそうなんだ。";
		mes "その間、何もせずに待つのも";
		mes "つまらないだろう？";
		next;
		switch(select("待つのは苦手だ","待つのは得意だ")) {
		case 1:
			mes "[ハンターギルド員]";
			mes "だよなあ！　うんうん！";
			mes "実は少し手伝ってほしい";
			mes "依頼がいくつかあってね。";
			next;
			mes "[ハンターギルド員]";
			mes "それを達成してくれたら、";
			mes "私の方からも多少は上に";
			mes "カエクスの件について";
			mes "色を付けて話してもいい。";
			mes "悪い話じゃないだろう？";
			next;
			mes "[ハンターギルド員]";
			mes "君が結果を待つ間に、";
			mes "私の依頼をこなすことで暇も潰せて、";
			mes "私もまたここにいる";
			mes "カエクスと親睦を深めることが";
			mes "できる……！　完璧だな！";
			next;
			mes "‐言ってることは正しいが";
			mes "　ハンターギルド員の口元が";
			mes "　^ff0000妙に緩んでいる^000000のは";
			mes "　気のせいだろうか……。";
			mes "　とりあえずそっとしておこう‐";
			next;
			mes "[ハンターギルド員]";
			break;
		case 2:
			mes "[ハンターギルド員]";
			mes "……いやいや！";
			mes "流石に君を待たせるわけにいかない！";
			mes "それにお願いを聞いてくれたら";
			mes "カエクスの件について";
			mes "色を付けて話してもいい。";
			mes "悪い話じゃないだろう？";
			next;
			mes "‐ハンターギルド員の目が";
			mes "　^ff0000つべこべいわずに受けろ^000000";
			mes "　と、物語っているのが見えた。";
			mes "　ここでハンターギルド員の機嫌を";
			mes "　損なうわけにはいかない。";
			mes "　仕方ないので依頼を受けよう‐";
			next;
			mes "[ハンターギルド員]";
			mes "そうかそうか！";
			mes "理解とご協力、感謝するよ！";
			break;
		}
		mes "それじゃあ、準備が出来たら";
		mes "もう1度、話しかけてくれるかな。";
		next;
		mes "‐鳥狩の呼子のレポートを作成し、";
		mes "　ギルド上層部によるカエクスの";
		mes "　ハンター試験受験についての";
		mes "　結論が出るのを待つ間、";
		mes "　頼みたいことがあると言われた。";
		mes "　もう一度ハンターギルド員に";
		mes "　話しかけよう‐";
		chgquest 115015,115018;
		TOGARI_QUE,7;
		close;
	case 7:
		mes "[ハンターギルド員]";
		mes "やっぱりこう……上目遣いか……？";
		mes "いや、やはり笑顔で……";
		mes "！？";
		mes "は、早いな！";
		mes "では、私からの頼みごとについて";
		mes "話すとしようじゃないか！";
		next;
		mes "[ハンターギルド員]";
		mes "結論から言えば、";
		mes "^ff0000モンスターの討伐^000000か、";
		mes "^ff0000アイテムの収集^000000を";
		mes "お願いしたい。";
		while() {
			next;
			mes "[ハンターギルド員]";
			mes "では、どちらの話を聞く？";
			next;
			switch(select("モンスターの討伐","アイテム収集")) {
			case 1:
				mes "[ハンターギルド員]";
				mes "^ff0000モンスターの討伐^000000は、最近フィゲルの";
				mes "住民を困らせている、^0000ffグリーンイグアナ^000000を";
				mes "^0000ff150体^000000、倒してきてほしい。";
				mes "私はちょっとあいつが苦手でさ。";
				mes "なるべく戦いたくないんだよ。";
				next;
				mes "[ハンターギルド員]";
				mes "これでいいか？";
				next;
				if(select("はい","いいえ") == 2)
					continue;
				mes "[ハンターギルド員]";
				mes "それじゃあ、";
				mes "^0000ffグリーンイグアナ150体^000000の";
				mes "討伐、よろしく頼んだぞ。";
				mes "アイテム収集に変えたい場合は、";
				mes "もう一度私に話してくれ。";
				next;
				mes "‐ハンターギルド員から、";
				mes "　グリーンイグアナ150体の";
				mes "　討伐を依頼された。";
				mes "　依頼内容を変えたい場合、";
				mes "　もう一度ハンターギルド員に";
				mes "　話しかけるといいらしい‐";
				chgquest 115018,96250;
				TOGARI_QUE,8;
				close;
			case 2:
				mes "[ハンターギルド員]";
				mes "^ff0000アイテムの収集^000000は、ハンターギルドの";
				mes "管理するファルコンに";
				mes "飲ませる薬の材料を";
				mes "集めてきてもらう。";
				next;
				mes "[ハンターギルド員]";
				mes "薬といっても怪しいものじゃない。";
				mes "人間で言う、漢方薬みたいなものだ。";
				next;
				mes "[ハンターギルド員]";
				mes "集めてほしいのは、";
				mes "^0000ffアロエの葉30個、";
				mes "油紙20個、";
				mes "なめらかな紙10個、";
				mes "フェイヨン水溶液1個、";
				mes "モロク水溶液1個^000000だ。";
				next;
				mes "[ハンターギルド員]";
				mes "これでいいか？";
				next;
				if(select("はい","いいえ") == 2)
					continue;
				mes "[ハンターギルド員]";
				mes "それじゃあ、";
				mes "^0000ffグリーンイグアナ150体^000000の";
				mes "討伐、よろしく頼んだぞ。";
				mes "アイテム収集に変えたい場合は、";
				mes "もう一度私に話してくれ。";
				next;
				mes "‐ハンターギルド員から、";
				mes "　グリーンイグアナ150体の";
				mes "　討伐を依頼された。";
				mes "　依頼内容を変えたい場合、";
				mes "　もう一度ハンターギルド員に";
				mes "　話しかけるといいらしい‐";
				chgquest 115018,115021;
				TOGARI_QUE,9;
				close;
			}
		}
	case 8:
		if(!(checkquest(96250) & 0x4)) {
			mes "[ハンターギルド員]";
			mes "どうした？";
			mes "グリーンイグアナ150体の";
			mes "討伐はまだ完了して";
			mes "いないみたいだが？";
			mes "アイテム収集に変えるのか？";
			next;
			if(select("このまま討伐を続ける","アイテム収集に変える") == 1) {
				mes "[ハンターギルド員]";
				mes "そうか。";
				mes "それでは頼んだぞ。";
				close;
			}
			mes "[ハンターギルド員]";
			mes "アイテム収集に変えるのか？";
			mes "^ff0000アイテムの収集^000000は、ハンターギルドの";
			mes "管理するファルコンに";
			mes "飲ませる薬の材料を";
			mes "集めてきてもらう。";
			next;
			mes "[ハンターギルド員]";
			mes "集めてほしいのは、";
			mes "^0000ffアロエの葉30個、";
			mes "油紙20個、";
			mes "なめらかな紙10個、";
			mes "フェイヨン水溶液1個、";
			mes "モロク水溶液1個^000000だ。";
			next;
			mes "[ハンターギルド員]";
			mes "アイテム収集に変えた場合、";
			mes "^ff0000今まで討伐で倒した数が";
			mes "無駄になってしまう^000000が、";
			mes "それでもいいか？";
			next;
			if(select("このまま討伐を続ける","アイテム収集に変える") == 1) {
				mes "[ハンターギルド員]";
				mes "そうか。";
				mes "それでは頼んだぞ。";
				close;
			}
			mes "[ハンターギルド員]";
			mes "わかった。";
			mes "では依頼をアイテム収集に変えるぞ。";
			next;
			mes "[ハンターギルド員]";
			mes "^0000ffアロエの葉30個、";
			mes "油紙20個、";
			mes "なめらかな紙10個、";
			mes "フェイヨン水溶液1個、";
			mes "モロク水溶液1個^000000だ。";
			mes "よろしく頼んだぞ。";
			next;
			mes "[ハンターギルド員]";
			mes "モンスター討伐に変えたい場合は、";
			mes "もう一度私に話してくれ。";
			next;
			mes "‐ハンターギルド員から、";
			mes "　アイテムの収集を";
			mes "　依頼された。";
			mes "　依頼内容を変えたい場合、";
			mes "　もう一度ハンターギルド員に";
			mes "　話しかけるといいらしい‐";
			chgquest 96250,115021;
			TOGARI_QUE,9;
			close;
		}
		mes "[ハンターギルド員]";
		mes "おお、討伐を完了したか。";
		mes "助かったよ、ありがとう！";
		next;
		mes "[ハンターギルド員]";
		mes "ちゃちゃっと報告してしまうから、";
		mes "ちょっと待ってくれ。";
		next;
		mes "‐討伐完了したことを";
		mes "　ハンターギルド員に報告した。";
		mes "　もう一度ハンターギルド員に";
		mes "　話しかけよう‐";
		chgquest 96250,115024;
		TOGARI_QUE,10;
		close;
	case 9:
		mes "[ハンターギルド員]";
		mes "どうした？";
		mes "依頼したアイテムはまだ";
		mes "集まっていないみたいだが？";
		next;
		mes "[ハンターギルド員]";
		mes "^0000ffアロエの葉30個、";
		mes "油紙20個、";
		mes "なめらかな紙10個、";
		mes "フェイヨン水溶液1個、";
		mes "モロク水溶液1個^000000だぞ。";
		next;
		mes "[ハンターギルド員]";
		mes "それとも、モンスター討伐に";
		mes "変えるのか？";
		next;
		if(select("このままアイテム収集を続ける","モンスター討伐に変える") == 1) {
			mes "[ハンターギルド員]";
			mes "そうか。";
			mes "それでは頼んだぞ。";
			close;
		}
		mes "[ハンターギルド員]";
		mes "モンスター討伐に変えるのか？";
		mes "^ff0000モンスターの討伐^000000は、最近フィゲルの";
		mes "住民を困らせている、^0000ffグリーンイグアナ^000000を";
		mes "^0000ff150体^000000、倒してきてほしい。";
		mes "私はちょっとあいつが苦手でさ。";
		mes "なるべく戦いたくないんだよ。";
		next;
		mes "[ハンターギルド員]";
		mes "モンスター討伐に変えていいか？";
		next;
		if(select("このままアイテム収集を続ける","モンスター討伐に変える") == 1) {
			mes "[ハンターギルド員]";
			mes "そうか。";
			mes "それでは頼んだぞ。";
			close;
		}
		mes "[ハンターギルド員]";
		mes "わかった。";
		mes "では依頼をモンスター討伐に変えるぞ。";
		mes "^0000ffグリーンイグアナ150体^000000の";
		mes "討伐、よろしく頼んだぞ。";
		mes "アイテム収集に変えたい場合は、";
		mes "もう一度私に話してくれ。";
		next;
		mes "‐ハンターギルド員から、";
		mes "　グリーンイグアナ150体の";
		mes "　討伐を依頼された。";
		mes "　依頼内容を変えたい場合、";
		mes "　もう一度ハンターギルド員に";
		mes "　話しかけるといいらしい‐";
		chgquest 115021,96250;
		TOGARI_QUE,8;
		close;
	case 10:
		mes "[ハンターギルド員]";
		mes "今回は面倒事を頼んでしまって、";
		mes "すまなかったな。";
		mes "お陰で久々に萌え……";
		next;
		menu "萌え？",-;
		mes "[ハンターギルド員]";
		mes "あ、いやいや！";
		mes "な、なんでもない！";
		mes "今のは忘れてくれ。";
		next;
		mes "[ハンターギルド員]";
		mes "それで、カエクスの話だが、";
		mes "^ff0000鳥狩の呼子^000000の性能を説明し、";
		mes "彼の事情も上層部に話したんだ。";
		next;
		mes "[ハンターギルド員]";
		mes "そうしたら、";
		mes "今後もハンターギルドに協力すること、";
		mes "という条件で、特別に動物連れでの";
		mes "転職試験の受験が許可された。";
		next;
		mes "[ハンターギルド員]";
		mes "あっさりすぎてビックリというか、";
		mes "私の今まで守ってきたことは";
		mes "何だったのだ、という疑問が";
		mes "湧くというか……。";
		next;
		mes "[ハンターギルド員]";
		mes "まあ、望んだ結果になったわけだから、";
		mes "良しとしよう。";
		next;
		mes "[ハンターギルド員]";
		mes "ちなみに……";
		mes "カエクスは、受験が許可されるなり";
		mes "試験に挑み、ハンターへの転職を";
		mes "見事達成した。";
		next;
		mes "[ハンターギルド員]";
		mes "とはいえ、ある意味特例だから";
		mes "カエクスの試験については";
		mes "他言無用で頼むよ。";
		next;
		mes "[ハンターギルド員]";
		mes "しかし、カエクスと話をしたところ、";
		mes "いろいろおかしな点が出てきてな。";
		next;
		menu "おかしな点？",-;
		mes "[ハンターギルド員]";
		mes "ああ……。";
		mes "まず、彼には姉がいるという";
		mes "話だったが、どうも本当の";
		mes "姉ではないらしい。";
		mes "カエクスが姉のように慕っていた、";
		mes "というのが正しいな。";
		next;
		mes "[ハンターギルド員]";
		mes "^ff0000鳥狩の呼子^000000も、カエクスが";
		mes "その姉のように慕っていた女性の物を";
		mes "よく勝手に持ち出して吹いたりして";
		mes "いたものだから、女性から、";
		mes "「私のものを吹かないで」と言われ……";
		mes "代わりに作り方を教えてもらったそうだ。";
		next;
		mes "[ハンターギルド員]";
		mes "他にも動物たちを使って";
		mes "彼女の行く先々に現れては";
		mes "物陰からじっと見ていたり……。";
		mes "それを注意されても彼的には";
		mes "「姉を心配するのは当たり前だ」";
		mes "と……。";
		next;
		mes "[ハンターギルド員]";
		mes "カエクス的にはそんな状況を";
		mes "「自分が一人前になることを望んでいる」";
		mes "「自分が姉を守る使命がある」";
		mes "と、よくわからないプラス思考で";
		mes "捉えているようだ……。";
		next;
		mes "[ハンターギルド員]";
		mes "まあ、どのような事情があるにしろ、";
		mes "^ff0000鳥狩の呼子^000000がハンターにとって、";
		mes "便利なアイテムであることは確かだ。";
		mes "深く追求するのはやめておこう……。";
		next;
		menu "ハンターギルドへの協力というのは？",-;
		mes "[ハンターギルド員]";
		mes "今回、君にお願いしたような、";
		mes "モンスターの討伐や、アイテム収集を";
		mes "カエクスがハンターたちに";
		mes "斡旋するというお仕事だ。";
		next;
		mes "[ハンターギルド員]";
		mes "達成した者には、お礼として、";
		mes "^ff0000鳥狩の呼子^000000や、";
		mes "^ff0000そのほかのアイテム^000000を渡す";
		mes "という役割を頼んだ。";
		next;
		menu "そのほかのアイテム？",-;
		mes "[ハンターギルド員]";
		mes "ああ。";
		mes "彼は^ff0000鳥狩の呼子^000000以外にも、";
		mes "ハンターにとって便利なアイテムを";
		mes "いくつか作れるらしい。";
		next;
		mes "[ハンターギルド員]";
		mes "それについて詳しくは、";
		mes "直接カエクスに聞いてくれ。";
		next;
		mes "‐カエクスはハンター試験を終え、";
		mes "　今後はハンターギルドのために";
		mes "　働くらしい。";
		mes "　カエクスのところに行ってみよう‐";
		chgquest 115024,115027;
		TOGARI_QUE,11;
		close;
	case 11:
		mes "[ハンターギルド員]";
		mes "カエクスは^ff0000鳥狩の呼子^000000以外にも、";
		mes "ハンターにとって便利なアイテムを";
		mes "いくつか作れるらしい。";
		next;
		mes "[ハンターギルド員]";
		mes "それについて詳しくは、";
		mes "直接カエクスに聞いてくれ。";
		next;
		mes "‐カエクスはハンター試験を終え、";
		mes "　今後はハンターギルドのために";
		mes "　働くらしい。";
		mes "　カエクスのところに行ってみよう‐";
		close;
	case 12:
		mes "[ハンターギルド員]";
		mes "カエクスの";
		mes "姉と呼ぶ女性への執着は";
		mes "すさまじいものがあるな。";
		mes "正直、ちょっと怖いくらいだ。";
		next;
		mes "[ハンターギルド員]";
		mes "うちの弟は、まあ相変わらずだが、";
		mes "今ではこれくらいの距離感が";
		mes "ちょうどいいかも、なんて";
		mes "思えるようになったよ……。";
		close;
	default:
		emotion 1;
		mes "[ハンターギルド員]";
		mes "ん？　何か用か？";
		mes "ハンターへの転職試験の申し込みなら";
		mes "そこのカウンターに立ってる";
		mes "女性に話しかけてくれ。";
		close;
	}
}
hugel.gat,215,224,3	script	シーオッター#togari_so	1323,{/* 58971 */}
hugel.gat,210,228,3	script	コウ#togari_kou	1415,{/* 58972 */}
hugel.gat,214,232,3	script	アリゲーター#togari_bea	1271,{/* 58973 */}
